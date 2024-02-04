public class TesteNaoTemExcecao {
    public static void main(String[] args) throws Exception {
        
        try {
            int[] vetor = new int[3];
            vetor[3] = 1;
            System.out.println("Teste");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Erro: " + e);
        }
        
    }
}
