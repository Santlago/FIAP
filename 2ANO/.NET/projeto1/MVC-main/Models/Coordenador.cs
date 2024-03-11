namespace _2TDSPK.Models
{
    public class Coordenador : Usuario
    {
        public Coordenador(string nome, string email) : base(nome, email)
        {
        }

        public int Id { get; set; }

    }
}
