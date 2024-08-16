using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages.Manage;
using System.Collections.Generic;

namespace PlayWithoutPay.Models
{
    public class User : Account
    {
        public User() { }
        public User(string login, string password, int id, string email = "") : base(login, password, id)
        {
            favoriteGames = new List<Game>(); 
        }

        protected string Email { get; set; }

        protected List<Game> favoriteGames { get; set; }

        public override void Signin()
        {
            base.Signin();

            throw new NotImplementedException();
        }
    }
}
