using System.ComponentModel.DataAnnotations;

namespace _2TDSPK.Validacoes
{
    [AttributeUsage(AttributeTargets.Property)]

    public class CPFValidacao : Attribute
    {
        [Required]
        public int numero { get; set; }

        public CPFValidacao()
        {
            //if (numero. < 14)
        }
    }
}
