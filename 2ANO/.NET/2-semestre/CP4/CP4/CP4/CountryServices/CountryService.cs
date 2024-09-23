using CP4.API.CountryServices.Responses;

using Newtonsoft.Json;
using System.Collections.Generic;
using System.Net.Http;
using System.Threading.Tasks;

namespace CP4.Services.CountryServices
{
    public class CountryService : ICountryService
    {
        private readonly HttpClient _client;

        public CountryService(HttpClient client)
        {
            _client = client;
            _client.BaseAddress = new Uri("https://restcountries.com/v3.1/");
        }

        // Método para obter todos os países
        public async Task<List<CountriesResponse>> GetAllCountries()
        {
            try
            {
                HttpResponseMessage response = await _client.GetAsync("all?fields=name,flags");

                if (response.IsSuccessStatusCode)
                {
                    string json = await response.Content.ReadAsStringAsync();
                    return JsonConvert.DeserializeObject<List<CountriesResponse>>(json);
                }
                else
                {
                    return new List<CountriesResponse>(); // Return an empty list instead of null
                }
            }
            catch (HttpRequestException)
            {
                return new List<CountriesResponse>(); // Return an empty list on exception
            }
        }

        // Método para obter um país específico pelo nome
        public async Task<CountriesResponse> GetCountryByName(string name)
        {
            try
            {
                HttpResponseMessage response = await _client.GetAsync($"name/{name}?fullText=true");

                if (response.IsSuccessStatusCode)
                {
                    string json = await response.Content.ReadAsStringAsync();
                    var countries = JsonConvert.DeserializeObject<List<CountriesResponse>>(json);
                    return countries != null && countries.Count > 0 ? countries[0] : null;
                }
                else
                {
                    return null;
                }
            }
            catch (HttpRequestException)
            {
                return null; // Return null on exception
            }
        }
    }
}