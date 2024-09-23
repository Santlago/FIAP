using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using CP4.Services.CountryServices;
using CP4.API.CountryServices.Responses;
using CP4.API.CountryServices;

namespace CP4.API.Controllers
{
    [Route("[controller]")]
    [ApiController]
    public class CountryController : ControllerBase
    {
        private readonly ICountryService _countryService;

        public CountryController(ICountryService countryService)
        {
            _countryService = countryService;
        }

        // GET /Country
        [HttpGet]
        [ProducesResponseType(typeof(List<CountriesResponse>), (int)HttpStatusCode.OK)]
        [ProducesResponseType((int)HttpStatusCode.NoContent)]
        [ProducesResponseType((int)HttpStatusCode.InternalServerError)]
        public async Task<ActionResult<List<CountriesResponse>>> GetAllCountries()
        {
            var countries = await _countryService.GetAllCountries();
            if (countries == null || countries.Count == 0)
            {
                return NoContent(); // Return NoContent if no countries are found
            }

            return Ok(countries);
        }

        // GET /Country/name/{name}
        [HttpGet("name/{name}")]
        [ProducesResponseType(typeof(CountriesResponse), (int)HttpStatusCode.OK)]
        [ProducesResponseType((int)HttpStatusCode.NotFound)]
        [ProducesResponseType((int)HttpStatusCode.InternalServerError)]
        public async Task<ActionResult<CountriesResponse>> GetCountryByName(string name)
        {
            var country = await _countryService.GetCountryByName(name);
            if (country == null)
            {
                return NotFound($"Country with name '{name}' not found.");
            }

            return Ok(country);
        }
    }
}