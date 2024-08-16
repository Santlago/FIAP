namespace _2TDSPK.ExemplosAntigos
{
    public class Coordenador : Usuario
    {
        public Coordenador(string nome, string email) : base(nome, email)
        {
        }

        public int Id { get; set; }

    }
}
