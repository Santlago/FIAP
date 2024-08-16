using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _2TDSPK.Persistencia.Models
{
    [Table("2TDSPK_Tb_Enderecos")]
    public class Endereco
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int EnderecoId { get; set; }

        [Required]
        public string CEP { get; set; }

        [Required]
        public string Logradouro { get; set; }

        public string Bairro { get; set; }

        public int Numero { get; set; }

        public string Complemento { get; set; }

    }
}
