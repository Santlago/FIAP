using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using _2TDSPK.Models;

namespace _2TDSPK.Persistencia.Models
{
    [Table("2TDSPK_Tb_Cursos")]
    public class Curso : Auditoria
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int CursoId { get; set; }

        [Required(ErrorMessage = "O nome é obrigatório.")]
        public string Nome { get; set; }


        public virtual IEnumerable<Turma>? Turmas { get; set; }

        //N..N
        public ICollection<Aluno>? Alunos { get; set; }

    }
}
