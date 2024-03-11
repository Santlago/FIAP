namespace PlayWithoutPay.Models
{
    public class Game
    {
        public Game(string name, int id = 0) {
            if (name == "")
            {
                throw new Exception("Login can't be blank");
            }
            if (id == 0)
            {
                Random random = new Random();
                Id = random.Next(1, 10000);
            }
            else
            {
                Id = id;
            }
            Name = name;
        }

        public int Id { get; set; }

        public string Name { get; set; }

        public string Description { get; set; }

        public string Genre { get; set; }

        public string Plataform { get; set; }
    }
}
