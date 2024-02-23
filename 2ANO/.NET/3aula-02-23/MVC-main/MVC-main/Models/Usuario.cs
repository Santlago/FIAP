namespace _2TDSPK.Models
{
    public class Usuario : Auditoria
    {
        public required string Nome { get; set; }
        public DateTime DataNascimento { get; set; }
        public required string Email { get; set; }
        public required Endereco Endereco { get; set; }
    }
}
