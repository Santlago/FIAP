using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using _2TDSPK.Models;

namespace _2TDSPK.Persistencia.Models
{
    [Table("2TDSPK_Tb_Alunos")]
    public class Aluno : Auditoria, IUsuario
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int AlunoId { get; set; }

        [Required(ErrorMessage = "O nome é obrigatório.")]
        public string Nome { get; set; }

        [Column("Email", TypeName = "varchar(255)")]
        [EmailAddress]
        public string Email { get; set; }

        [MaxLength(11, ErrorMessage = "O CPF deve conter no máximo 11 caracteres.")]
        public string CPF { get; set; }

        [Range(1, 8, ErrorMessage = "O semestre deve estar entre 1 e 8.")]
        public int Semestre { get; set; }

        //1..1
        public int EnderecoId { get; set; }
        public Endereco? Endereco { get; set; }

        //N..N
        public ICollection<Curso>? Cursos { get; set; }

        public void Login()
        {
            throw new NotImplementedException();
        }

        public void Logout()
        {
            throw new NotImplementedException();
        }

        public void VerificarMatricula()
        {

        }

        public void VerificarNome(string nome)
        {
            throw new NotImplementedException();
        }
    }
}
