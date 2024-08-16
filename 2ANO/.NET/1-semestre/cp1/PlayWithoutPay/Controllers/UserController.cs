using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Mvc;
using PlayWithoutPay.Models;
using System.Text.Json;

namespace PlayWithoutPay.Controllers
{
    public class UserController: Controller
    {

        public IActionResult Index()
        {
            return View();
        }

        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(User user)
        {
            User userLogin = null; 

            if (user != null)
            {
                userLogin = new User(user.Login, user.Password, user.Id);
            }

            return View("~/Views/Home/Index.cshtml", userLogin); 
        }
    }
}
