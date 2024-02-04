package tests;

import dao.EnderecoDao;
import entity.Endereco;

import java.sql.SQLException;
import java.util.Scanner;

public class Teste {

    public static void menu(){
        System.out.println("*******************************************************");
        System.out.println("Sistema FIAP");
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
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);

        Endereco end = new Endereco();
        EnderecoDao dao = new EnderecoDao();
        int opcao;

        do{
            menu();
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    end = preencheDados(end);
                    try {
                        //Inserir no banco de dado
                        dao.inserir(end);
                        System.out.println("Endereço cadastrado com sucesso!");
                    }catch (SQLException e){
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
            }
        }while (opcao != 7);
        //Preenchemos o endereço



    }
}
