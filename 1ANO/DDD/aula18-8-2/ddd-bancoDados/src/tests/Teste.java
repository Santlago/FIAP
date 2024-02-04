package br.com.fiap.bancoDados.tests;

import br.com.fiap.bancoDados.dao.AlunoDao;
import br.com.fiap.bancoDados.dao.EnderecoDao;
import br.com.fiap.bancoDados.entity.Aluno;
import br.com.fiap.bancoDados.entity.Endereco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void menuPrincipal(){
        System.out.println("*******************************************************");
        System.out.println("Sistema FIAP");
        System.out.println("Selecione a opção desejada:" +
                "\n1 - Aluno." +
                "\n2 - Endereço" +
                "\n3 - Sair" +
                "\nOpção desejada: ");
    }
    public static void menu(){
        System.out.println("*******************************************************");
        System.out.println("Selecione a opção desejada:" +
                "\n1 - Cadastrar endereço." +
                "\n2 - Alterar endereço." +
                "\n3 - Excluir endereço." +
                "\n4 - Consultar um endereço por Id." +
                "\n5 - Consultar um endereço por Cep" +
                "\n6 - Exibir todos endereços." +
                "\n7 - Sair" +
                "\nOpção desejada: ");
    }

    public static void menuAluno(){
        System.out.println("*******************************************************");
        System.out.println("Selecione a opção desejada:" +
                "\n1 - Cadastrar aluno." +
                "\n2 - Alterar aluno." +
                "\n3 - Excluir aluno." +
                "\n4 - Consultar um aluno por Id." +
                "\n5 - Exibir todos alunos" +
                "\n6 - Sair" +
                "\nOpção desejada: ");
    }
    public static Endereco preencheDados(Endereco end){
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        System.out.println("Digite o cep do endereço");
        end.setCep(leitorTexto.nextLine());
        System.out.println("Digite o nome da rua/avenida: ");
        end.setLogradouro(leitorTexto.nextLine());
        System.out.println("Número: ");
        end.setNumero(leitorTexto.nextLine());
        System.out.println("Digite o complemento [se houver]: ");
        end.setComplemento(leitorTexto.nextLine());
        System.out.println("Bairro: ");
        end.setBairro(leitorTexto.nextLine());
        System.out.println("Cidade: ");
        end.setLocalidade(leitorTexto.nextLine());
        System.out.println("Estado [UF]: ");
        end.setUf(leitorTexto.nextLine());
        System.out.println("Id");
        end.setId(leitorNumerico.nextInt());
        return end;
    }
    public static void main(String[] args) throws SQLException {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        Endereco end = new Endereco();
        EnderecoDao dao = new EnderecoDao();
        AlunoDao alunoDao = new AlunoDao();
        Aluno aluno = new Aluno();
        EnderecoDao endDado = new EnderecoDao();

        //Declaração da lista de endereços
        List<Endereco> listaEnderecos = new ArrayList<>();
        int opcao, opcaoMenuPrincipal;

        do {
            menuPrincipal();
            opcaoMenuPrincipal = leitor.nextInt();
            switch (opcaoMenuPrincipal) {
                case 1:
                    do{
                        menuAluno();
                        opcao = leitor.nextInt();
                        switch (opcao){
                            case 1:

                                System.out.println("Por favor digite o id da residencia:");
                                int id = leitor.nextInt();
                                try{
                                    end = endDado.buscarPorId(id);
                                    aluno.setEndereco(end);
                                    System.out.println(aluno.getEndereco().toString());
                                }
                                catch(SQLException e){
                                    e.printStackTrace();
                                }
                                aluno.setId(2);
                                aluno.setNome("Eliane2");
                                aluno.setCpf("121545445");

                                alunoDao.inserir(aluno);
                                break;
                            case 4:
                                System.out.println("Digite o id do aluno: ");
                                id = leitor.nextInt();
                                aluno= alunoDao.buscarPorId(id);
                                System.out.println(aluno.toString());

                        }
                    }while (opcao != 6);
                    break;
                case 2:
                    do {
                        menu();
                        opcao = leitor.nextInt();
                        switch (opcao) {
                            case 1:
                                end = preencheDados(end);
                                try {
                                    //Inserir no banco de dado
                                    dao.inserir(end);
                                    System.out.println("Endereço cadastrado com sucesso!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                end = preencheDados(end);
                                dao.alterar(end);
                                break;
                            case 3:
                                System.out.println("Digite o id do registro que será excluído: ");
                                int id = leitor.nextInt();
                                dao.excluir(id);
                                break;
                            case 4:
                                System.out.printf("Digite o id do endereço para consulta:");
                                id = leitor.nextInt();
                                end = dao.buscarPorId(id);
                                System.out.println(end.toString());
                                break;
                            case 5:
                                String dados = "";
                                System.out.println("Digite o cep do endereço para consulta: ");
                                String cep = leitorTexto.nextLine();
                                listaEnderecos = dao.buscarPorCep(cep);
                                for (Endereco endereco : listaEnderecos) {
                                    dados += "=====================================\n";
                                    dados += "Id: " + endereco.getId() + "\n";
                                    dados += "Endereço: " + endereco.getLogradouro() + "\n";
                                    dados += "Número: " + endereco.getNumero() + "\n";
                                    dados += "Complemento: " + endereco.getComplemento() + "\n";
                                    dados += "CEP: " + endereco.getCep() + "\n";
                                    dados += "Bairro: " + endereco.getBairro() + "\n";
                                    dados += "Cidade: " + endereco.getLogradouro() + "\n";
                                    dados += "UF: " + endereco.getUf() + "\n";
                                    dados += "=====================================\n";
                                }
                                System.out.println(dados);
                                break;
                            case 6:
                                dados = "";
                                listaEnderecos = dao.buscarEnderecos();
                                for (Endereco endereco : listaEnderecos) {
                                    dados += "=====================================\n";
                                    dados += "Id: " + endereco.getId() + "\n";
                                    dados += "Endereço: " + endereco.getLogradouro() + "\n";
                                    dados += "Número: " + endereco.getNumero() + "\n";
                                    dados += "Complemento: " + endereco.getComplemento() + "\n";
                                    dados += "CEP: " + endereco.getCep() + "\n";
                                    dados += "Bairro: " + endereco.getBairro() + "\n";
                                    dados += "Cidade: " + endereco.getLogradouro() + "\n";
                                    dados += "UF: " + endereco.getUf() + "\n";
                                    dados += "=====================================\n";
                                }
                                System.out.println(dados);
                                break;

                        }
                    } while (opcao != 7);
                    //Preenchemos o endereço
                    break;
            }
        }while (opcaoMenuPrincipal != 3);

    }
}
