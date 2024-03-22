using _2TDSPK.Models;
using Microsoft.EntityFrameworkCore;

namespace _2TDSPK.Persistencia
{
    public class OracleDbContext : DbContext
    {
        public DbSet<Aluno> Alunos { get; set; } /*Alunoes*/
        public DbSet<Professor> Professores { get; set; }
        public DbSet<Coordenador> Coordenadores { get; set; }

        public OracleDbContext(DbContextOptions<OracleDbContext> options) : base(options)
        {
            
        }

    }
}
