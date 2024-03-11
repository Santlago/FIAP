namespace _2TDSPK.Models
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
        
        public string Email { get; set; }

        public string Senha { get; set; }

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
    }
}
