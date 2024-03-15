using _2TDSPK.Models;
using Microsoft.AspNetCore.Mvc;

namespace _2TDSPK.Controllers
{
    public class AlunoController : Controller
    {
        public IActionResult Index()
        {
            Aluno aluno = new("Thiago", "thiago@keller.com");

            Dictionary<string, int> configuracoes = new Dictionary<string, int>();
            configuracoes.Add("senha", 123456);
            configuracoes.Add("senha", 123456);
            configuracoes.Add("senha", 123456);

            HashSet<Aluno> hashAlunos = new HashSet<Aluno>();
            hashAlunos.Add(new("Thiago", "thiago@keller.com"));
            hashAlunos.Add(new("Brenno", "Brenno@keller.com"));
            hashAlunos.Add(new("Thiago", "thiago@keller.com"));

            //Primeiro a entrar é o primeiro a sair
            //First In First Out
            //FIFO
            Queue<int> queueInt = new Queue<int>();
            queueInt.Enqueue(1);
            queueInt.Enqueue(2);
            queueInt.Enqueue(3);

            int proximoItem = queueInt.Dequeue(); /*resultado 1*/
            int proximoItem2 = queueInt.Dequeue(); /*resultado 2*/
            
            queueInt.Enqueue(4);

            int proximoItem3 = queueInt.Dequeue(); /*resultado 3*/

            //Ultima a entrar é a primeira a sair
            //Last In First Out
            //LIFO
            Stack<int> stackInt = new Stack<int>();
            stackInt.Push(1);
            stackInt.Push(2);
            stackInt.Push(3);

            int proximoItemStack = stackInt.Pop(); /*resultado 3*/
            int proximoItemStack2 = stackInt.Pop(); /*resultado 2*/

            stackInt.Push(4);

            int proximoItemStack3 = stackInt.Pop(); /*resultado 4*/
            int proximoItemStack4 = stackInt.Pop(); /*resultado 1*/



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
            Aluno aluno4 = new("Enzo", "enzo@teste.com");

            listaAluno.Add(aluno);
            listaAluno.Add(aluno2);
            listaAluno.Add(aluno3);
            listaAluno.Add(aluno4);

            Aluno novoAluno;

            for (int i = 0; i < listaAluno.Count(); i++)
            {
                if (listaAluno[i].GetNome()== "Enzo" & listaAluno[i].Email == "Enzo")
                {
                    novoAluno = listaAluno[i];
                }
            }

            Aluno novoAluno2 = listaAluno.Where(x => x.GetNome() == "Enzo" && x.Email == "enzo@teste.com").Single();
       

            //select top(1) from alunos where alunos.nome="enzo" and alunos.email="enzo@"

            return View(listaAluno);
        }

        public void EnviarEmail(List<Aluno> listaAluno)
        {
            var conexaoServidorEmail = true;

            foreach (var aluno in listaAluno)
            {
                try
                {
                    //DisparaEmail
                }
                catch (ArgumentException ex) //Erro por conta do servidor de email
                {
                    //Gravar no log
                    //retenta
                }
                catch (Exception ex) //Erro por email invalido - joao@
                {
                    //Gravar no log
                    //conexaoServidorEmail = false;
                }
                finally
                {
                    conexaoServidorEmail = false;
                }
            }

        }
    }
}
