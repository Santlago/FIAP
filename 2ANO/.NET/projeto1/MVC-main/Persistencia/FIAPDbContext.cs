using _2TDSPK.Persistencia.Models;
using Microsoft.EntityFrameworkCore;

namespace _2TDSPK.Persistencia
{
    public class FIAPDbContext : DbContext
    {
        public DbSet<Aluno> Alunos { get; set; } /*Alunoes*/

        public DbSet<Curso> Cursos { get; set; }

        public DbSet<Materia> Materias { get; set; }
        public DbSet<Turma> Turmas { get; set; }

        public FIAPDbContext(DbContextOptions<FIAPDbContext> options) : base(options)
        {

            
        }
    }
}
