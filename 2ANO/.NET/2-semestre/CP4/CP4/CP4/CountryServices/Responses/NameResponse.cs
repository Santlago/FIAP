using Microsoft.AspNetCore.Mvc;

namespace CP4.API.CountryServices.Responses
{
    public class NameResponse : ControllerBase
    {
        public string common { get; set; }
        public string official { get; set; }
    }
}
