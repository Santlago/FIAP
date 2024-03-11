namespace _2TDSPK.Models
{
    public class Endereco : Auditoria
    {
        public int Id { get; set; }

        public string CEP { get; set; }

        public int Tipo { get; set; }
    }
}
