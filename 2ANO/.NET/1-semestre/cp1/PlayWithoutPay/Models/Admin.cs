using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages.Manage;

namespace PlayWithoutPay.Models
{
    public class Admin : Account
    {
        public Admin(string login, string password, int id, string accessLevel) : base(login, password, id)
        {
            this.accessLevel = accessLevel;
        }

        public string accessLevel { get; set; }

        internal void EditUser()
        {
            //Edit user
        }
    }
}
