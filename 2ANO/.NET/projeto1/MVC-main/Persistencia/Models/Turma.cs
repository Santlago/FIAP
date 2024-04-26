using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using _2TDSPK.Models;

namespace _2TDSPK.Persistencia.Models
{
    [Table("2TDSPK_Tb_Turmas")]
    public class Turma : Auditoria
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int TurmaId { get; set; }

        [Required]
        public string Nome { get; set; }

        //1..N - Relacionamentos
        public int CursoId { get; set; }
        public Curso? Curso { get; set; }
    }
}
