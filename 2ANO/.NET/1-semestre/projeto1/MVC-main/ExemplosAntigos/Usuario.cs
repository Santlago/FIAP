using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _2TDSPK.ExemplosAntigos
{
    public class Usuario : Auditoria, IUsuario
    {
        public Usuario(string nome, string email)
        {
            if (nome == "")
                throw new Exception("O Nome nao pode ser vazio");

            Nome = nome;
            Email = email;
        }
        private string Nome { get; set; }

        protected DateTime DataNascimento { get; set; }

        [EmailAddress(ErrorMessage = "Erro no email")]
        public string Email { get; set; }

        [MinLength(8, ErrorMessage = "A quantidade de caracteres minina é 8")]
        public string Senha { get; set; }

        [NotMapped]
        public List<Endereco> Endereco { get; set; }

        public string GetNome()
        {
            return Nome;
        }

        public virtual void Logar()
        {

            //Verificar se existe o usuario baseado no email
            //Se o usuario existir verifica a senha
            //se a senha estiver correta,
            //gera um token
            throw new NotImplementedException();
        }

        public void Deslogar()
        {
            //apagar o token
            throw new NotImplementedException();
        }

        public void VerificarNome(string nome)
        {
            throw new NotImplementedException();
        }
    }
}
