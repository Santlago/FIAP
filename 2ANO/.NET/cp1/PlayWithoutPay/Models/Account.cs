namespace PlayWithoutPay.Models
{
    public class Account : IAccount
    {
        public Account() { }
        public Account(string login, string password, int id = 0)
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

        public int Id { get; set; }

        public string Login { get; set; }

        public string Password { get; set; }

        public virtual void Signin()
        {
            throw new NotImplementedException();
        }

        public void Logout()
        {
            throw new NotImplementedException();
        }
    }
}
