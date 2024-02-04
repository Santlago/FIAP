package tests;

import dao.PessoaDao;
import entity.Pessoa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void menuPrincipal() {
        System.out.println("*******************************************************");
        System.out.println("Sistema FIAP");
        System.out.println("Selecione a opção desejada:" +
                "\n1 - Pessoa." +
                "\n2 - Sair" +
                "\nOpção desejada: ");
    }

    public static void menu() {
        System.out.println("*******************************************************");
        System.out.println("Selecione a opção desejada:" +
                "\n1 - Cadastrar pessoa." +
                "\n2 - Alterar pessoa." +
                "\n3 - Excluir pessoa." +
                "\n4 - Consultar uma pessoa por Id." +
                "\n5 - Exibir todas as pessoas" +
                "\n6 - Sair" +
                "\nOpção desejada: ");
    }

    public static Pessoa preencheDados(Pessoa pessoa) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        pessoa.setNome(leitorTexto.nextLine());
        System.out.println("Digite o CPF: ");
        pessoa.setCpf(leitorTexto.nextLine());
        System.out.println("Digite o email: ");
        pessoa.setEmail(leitorTexto.nextLine());
        System.out.println("Digite o telefone: ");
        pessoa.setTelefone(leitorTexto.nextLine());
        System.out.println("Digite o endereço: ");
        pessoa.setEndereco(leitorTexto.nextLine());
        System.out.println("Digite a idade: ");
        pessoa.setIdade(leitorNumerico.nextInt());
        System.out.println("Digite o gênero: ");
        pessoa.setGenero(leitorTexto.nextLine());
        System.out.println("Id: ");
        pessoa.setId(leitorNumerico.nextInt());
        return pessoa;
    }

    public static void main(String[] args) throws SQLException {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        PessoaDao dao = new PessoaDao();

        List<Pessoa> listaPessoas = new ArrayList<>();
        int opcao, opcaoMenuPrincipal;

        do {
            menuPrincipal();
            opcaoMenuPrincipal = leitor.nextInt();
            switch (opcaoMenuPrincipal) {
                case 1:
                    do {
                        menu();
                        opcao = leitor.nextInt();
                        switch (opcao) {
                            case 1:
                                pessoa = preencheDados(pessoa);
                                try {
                                    dao.inserir(pessoa);
                                    System.out.println("Pessoa cadastrada com sucesso!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                pessoa = preencheDados(pessoa);
                                dao.alterar(pessoa);
                                break;
                            case 3:
                                System.out.println("Digite o id da pessoa que será excluída: ");
                                int id = leitor.nextInt();
                                dao.excluir(id);
                                break;
                            case 4:
                                System.out.println("Digite o id da pessoa para consulta:");
                                id = leitor.nextInt();
                                pessoa = dao.buscarPorId(id);
                                System.out.println(pessoa.toString());
                                break;
                            case 5:
                                String dados = "";
                                listaPessoas = dao.buscarPessoas();
                                for (Pessoa p : listaPessoas) {
                                    dados += "=====================================\n";
                                    dados += "Id: " + p.getId() + "\n";
                                    dados += "Nome: " + p.getNome() + "\n";
                                    dados += "CPF: " + p.getCpf() + "\n";
                                    dados += "Email: " + p.getEmail() + "\n";
                                    dados += "Telefone: " + p.getTelefone() + "\n";
                                    dados += "Endereço: " + p.getEndereco() + "\n";
                                    dados += "Idade: " + p.getIdade() + "\n";
                                    dados += "Gênero: " + p.getGenero() + "\n";
                                    dados += "=====================================\n";
                                }
                                System.out.println(dados);
                                break;
                        }
                    } while (opcao != 6);
                    break;
            }
        } while (opcaoMenuPrincipal != 2);
    }
}
