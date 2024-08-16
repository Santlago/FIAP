using _2TDSPK.Validacoes;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _2TDSPK.ExemplosAntigos
{
    [Table("TB_ALUNOS", Schema = "2TDSPK")]
    public class Aluno : Usuario
    {
        public Aluno(string nome, string email, int rm = 0) : base(nome, email)
        {
            if (rm == 0)
            {
                Random random = new Random();
                RM = random.Next(1, 10000);
            }
            else
            {
                RM = rm;
            }
        }

        [Key]
        [Column("Identificacao")]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)] /*AutoIncrement*/
        public int Id { get; set; }

        //DDL
        //Create TABLE TB_ALUNOS_PK(
        //        Id int PRIMARY KEY,
        //        Rm int NOT NULL
        //    )

        [CPFValidacao]
        private int RM { get; set; }


        public int Idade()
        {
            return DateTime.Now.Year - DataNascimento.Year;
        }

        [ForeignKey("")]
        public int Curso { get; set; }

        internal void AprovaAluno()
        {
            //AprovaAluno aluno caso presenca superior a 75%
            //MediaType > 7
        }
    }
}
