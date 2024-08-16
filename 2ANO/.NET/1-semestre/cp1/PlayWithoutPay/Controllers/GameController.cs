using Microsoft.AspNetCore.Mvc;
using PlayWithoutPay.Models;

namespace PlayWithoutPay.Controllers
{
    public class GameController : Controller
    {
        public IActionResult Index()
        {
            List<Game> gamesList = new List<Game>();

            Game game1 = new("Valorant");
            Game game2 = new("Overwatch");
            Game game3 = new("Counter-Strike");
            Game game4 = new("Dota 2");


            gamesList.Add(game1);
            gamesList.Add(game2);
            gamesList.Add(game3);
            gamesList.Add(game4);                      

            return View(gamesList);
        }
    }
}
