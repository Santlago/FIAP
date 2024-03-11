

namespace _2TDSPK.Models
{
    public class Aluno : Usuario
    {      
        public Aluno(string nome, string email, int rm = 0) : base(nome, email)
        {
            if (rm == 0)
            {
                Random random = new Random();
                RM = random.Next(1, 10000);
            }else
            { 
                RM = rm; 
            }           
        }

        public int Id { get; set; }

        private int RM { get; set; }

        public int Idade()
        {
            return DateTime.Now.Year - DataNascimento.Year;
        }

        internal void AprovaAluno()
        {
            //AprovaAluno aluno caso presenca superior a 75%
            //MediaType > 7
        }
    }
}
