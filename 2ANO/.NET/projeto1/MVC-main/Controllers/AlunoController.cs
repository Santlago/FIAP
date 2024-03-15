using _2TDSPK.Models;
using Microsoft.AspNetCore.Mvc;

namespace _2TDSPK.Controllers
{
    public class AlunoController : Controller
    {
        public IActionResult Index()
        {
            Aluno aluno = new("Thiago", "thiago@keller.com");
            //aluno.Logar();

            Dictionary<string, int> configuracoes = new Dictionary<string, int>();
            configuracoes.Add("senha", 123456);

            return View(aluno);
        }

        public IActionResult ListaAlunos()
        {

            int[] idade = new int[4];
            idade[1] = 38;

            List<Aluno> listaAluno = new List<Aluno>();

            Aluno aluno = new("Thiago", "thiago@keller.com");
            Aluno aluno2 = new("Clara", "clara@keller.com");
            Aluno aluno3 = new("Enzo", "enzo@keller.com");

            listaAluno.Add(aluno);
            listaAluno.Add(aluno2);
            listaAluno.Add(aluno3);

            var novoAluno2 = listaAluno.Where(x => x.GetNome() == "Enzo");

            return View(listaAluno);
        }
    }
}
