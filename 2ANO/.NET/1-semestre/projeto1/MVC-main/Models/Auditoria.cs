namespace _2TDSPK.Models
{
    public class Auditoria
    {
        public bool Status { get; set; }
        public string UsuarioCriacao { get; set; }
        public DateTime DataCriacao { get; set; }

        public string UsuarioAlteracao { get; set; }
        public DateTime DataAlteracao { get; set; }
    }
}
