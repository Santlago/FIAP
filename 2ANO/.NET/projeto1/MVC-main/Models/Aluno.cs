

using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _2TDSPK.Models
{
    [Table("TB_ALUNOS_PK")]
    public class Aluno : Usuario
    {
        public Aluno(string nome, string email, int rm = 0) : base(nome, email)
        {
            if (rm == 0)
            {
                Random random = new Random();
                RM = random.Next(1, 10000);
            } else
            {
                RM = rm;
            }
        }

        [Key]
        [Required]
        public int Id { get; set; }

        //DDL
        //Create TABLE TB_ALUNOS_PK(
        //        Id int PRIMARY KEY,
        //        Rm int NOT NULL
        //    )

        [Required()]
        [MinLength(4)]
        [MaxLength(8)]
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
