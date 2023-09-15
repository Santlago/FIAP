package entity;


import enums.EstadoMultaEnum;

import java.time.LocalDate;
import java.util.Date;

public class Multa {
    private int id;
    private LocalDate dataAplicacao;
    private Date vencimento;
    private EstadoMultaEnum estadoMulta; //EM_ABERTO; EM_ATRASO; PAGA
    private String orgao;
    private Pessoa condutor;
    private Veiculo veiculo;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String mensagem ="Dados do Multa"
                + "\nData da aplicação: " + dataAplicacao
                + "\nData do vencimento: " + vencimento
                + "\nEstado multa: " + estadoMulta
                + "\nOrgão: " + orgao
                + "\n" + condutor.toString()
                + "\n" + veiculo.toString()
                + "*********************************";
        return mensagem;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Date getVencimento() {
        return vencimento;
    }
    public void setVencimento(Date dataVencimento) {
        this.vencimento = dataVencimento;
    }

    public EstadoMultaEnum getEstadoMulta() {
        return estadoMulta;
    }

    public void setEstadoMulta(EstadoMultaEnum estadoMulta) {
        this.estadoMulta = estadoMulta;
    }

    public String getOrgao() {
        return orgao;
    }
    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }
    public Pessoa getCondutor() {
        return condutor;
    }
    public void setCondutor(Pessoa condutor) {
        this.condutor = condutor;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
