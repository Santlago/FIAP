using System.ComponentModel.DataAnnotations.Schema;

namespace _2TDSPK.Database.Models
{
    [Table("1PROJETO_USER")]
    public class User
    {
        public int Id { get; set; }
        public string Email { get; set; }
        public string Password { get; set; }
        public bool Blocked { get; set; }
        public bool Status { get; set; }
    }
}
