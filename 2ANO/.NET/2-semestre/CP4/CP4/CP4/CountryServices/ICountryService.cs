using CP4.API.CountryServices.Responses;

namespace CP4.Services.CountryServices
{
    public interface ICountryService
    {
        Task<List<CountriesResponse>> GetAllCountries();
        Task<CountriesResponse> GetCountryByName(string name);
    }
}