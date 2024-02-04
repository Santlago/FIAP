/**
 * A classe FilmeOmdb representa informações de um filme obtidas a partir da API OMDB.
 * Link da API: https://www.omdbapi.com/
 * Ela inclui o título do filme, o ano de lançamento, a duração e a trama.
 * Esta classe é uma classe de registro (record) que fornece uma maneira concisa de criar
 * objetos imutáveis com atributos de leitura.
 */
package models;

public record FilmeOmdb(String title, int year, String runtime, String plot) {
    /**
     * Obtém o título do filme.
     * @return O título do filme.
     */
    public String title() {
        return title;
    }

    /**
     * Obtém o ano de lançamento do filme.
     * @return O ano de lançamento do filme.
     */
    public int year() {
        return year;
    }

    /**
     * Obtém a duração do filme em formato de string.
     * @return A duração do filme em formato de string.
     */
    public String runtime() {
        return runtime;
    }

    /**
     * Obtém a trama do filme.
     * @return A trama do filme.
     */
    public String plot() {
        return plot;
    }
}
