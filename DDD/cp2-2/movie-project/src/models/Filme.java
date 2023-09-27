/**
 * A classe Filme representa informações sobre um filme.
 * Ela inclui o nome do filme, o ano de lançamento, a duração em minutos e a trama.
 * 
 * Esta classe também fornece métodos para acessar e modificar essas informações.
 */

package models;
public class Filme {
    
    
    // attributes
    private String nome;
    private int anoDeLancamanto;
    private int duracaoEmMinutos;
    private String trama;

    //constructors
    /**
     * Cria um objeto Filme com base nos dados de um objeto FilmeOmdb.
     * @param meuFilmeOmdb O objeto FilmeOmdb a partir do qual os dados serão extraídos.
     */
    public Filme(FilmeOmdb meuFilmeOmdb) {
        this.nome = meuFilmeOmdb.title();
        this.anoDeLancamanto = Integer.valueOf(meuFilmeOmdb.year());
        if (meuFilmeOmdb.runtime() != null) {
            this.duracaoEmMinutos = Integer.valueOf(meuFilmeOmdb.runtime().substring(0, 2));
        }
        this.trama = meuFilmeOmdb.plot();
    }

    // methods
    /**
     * Retorna uma representação em string do objeto Filme.
     * @return Uma string que contém o nome, ano de lançamento, duração em minutos e trama do filme.
     */
    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", anoDeLancamanto=" + anoDeLancamanto + ", duracaoEmMinutos=" + duracaoEmMinutos
                + ", trama=" + trama + "]";
    }
    
    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamanto() {
        return anoDeLancamanto;
    }

    public void setAnoDeLancamanto(int anoDeLancamanto) {
        this.anoDeLancamanto = anoDeLancamanto;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }
}
