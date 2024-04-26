using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using _2TDSPK.Models;

namespace _2TDSPK.Persistencia.Models
{
    [Table("2TDSPK_Tb_Materias")]

    public class Materia : Auditoria
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int MateriaId { get; set; }

        [Required]
        public string Nome { get; set; }


        //1..1 




        //N..N

    }
}
