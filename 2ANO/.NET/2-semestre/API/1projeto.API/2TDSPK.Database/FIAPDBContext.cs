using _2TDSPK.Database.Models;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2TDSPK.Database
{
    public class FIAPDBContext : DbContext
    {
        public DbSet<User> users {  get; set; }
        
        public FIAPDBContext(DbContextOptions<FIAPDBContext> options) : base(options) { }
    }

}
