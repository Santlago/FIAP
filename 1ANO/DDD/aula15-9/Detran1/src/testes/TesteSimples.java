package testes;

import entity.Multa;
import entity.Pessoa;
import entity.Veiculo;
import enums.EstadoMultaEnum;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class TesteSimples {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Eliane");
        pessoa.setId(1);
        pessoa.setEndereco("rua xyz,38");
        pessoa.setTelefone("87877877");
        pessoa.setCpf("87878787877");

        Veiculo veiculo = new Veiculo();
        veiculo.setId(1);
        veiculo.setAno(1978);
        veiculo.setModelo("fusca");
        veiculo.setRenavam("44545454544");
        veiculo.setProprietario(pessoa);

        Multa multa = new Multa();
        multa.setId(1);
        multa.setDataAplicacao(LocalDate.now());
        System.out.println("Estado da multa: \n1 - Em aberto.\n2- Em atraso.\n3- paga.\nDigite a opção");
        int op = leitura.nextInt();
        if(op==1)
            multa.setEstadoMulta(EstadoMultaEnum.EM_ABERTO);
        else if(op==2)
            multa.setEstadoMulta(EstadoMultaEnum.EM_ATRASO);
        else
            multa.setEstadoMulta(EstadoMultaEnum.PAGA);
    }
}
