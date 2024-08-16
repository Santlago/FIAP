namespace _2TDSPK.Persistencia
{
    public interface IUsuario
    {
        string Nome { get; }

        void Login();

        void Logout();

        void VerificarNome(string nome);
    }
}
