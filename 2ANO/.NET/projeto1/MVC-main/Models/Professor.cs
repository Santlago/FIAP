namespace _2TDSPK.Models
{
    public class Professor : Usuario
    {
        public Professor(string nome, string email) : base(nome, email)
        {
        }
        public override void Logar()
        {
            //Verificar MFA
            base.Logar();

            throw new NotImplementedException();
        }
        public int Id { get; set; }
    }
}
