namespace PlayWithoutPay.Models
{
    public class User
    {
        public User(string login, string password, int id = 0)
        {
            if (login == "")
            {
                throw new Exception("Login can't be blank");
            }
            if (id == 0)
            {
                Random random = new();
                Id = random.Next(1, 10000);
            }
            else
            {
                Id = id;
            }
            Login = login;
            Password = password;
        }

        private int Id { get; set; }

        private string Login { get; set; }

        private string Password { get; set; }

        private List<Game> favoriteGames = new List<Game>();
    }
}
