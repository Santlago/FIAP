namespace _2TDSPK.Models
{
    public class Usuario : Auditoria
    {
        private string Nome { get; set; }
        public DateTime DataNascimento { get; set; }
        public string Email { get; set; }
        public Endereco Endereco { get; set; }

        public void SetNome(string nome)
        {
            if (nome == "")
            {
                throw new Exception("O nome não pode ser vazio");
            }
            Nome = nome;
        }

        public string GetNome()
        {
            return Nome;
        }
    }
}
