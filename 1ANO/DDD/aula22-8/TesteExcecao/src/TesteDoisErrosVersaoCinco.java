public class TesteDoisErrosVersaoCinco {
    
    public static void main(String[] args) {
        
        int[] numero = {2, 4, 5, 16, 32, 64};
        int[] denom = {2, 2, 0, 2, 0};
        for (int i = 0; i < numero.length; i++) {
            try {
                System.out.println("Resultado: " + numero[i] / denom[i]);
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println("Erro: " + e.getMessage());
            } catch (Throwable e) {
                System.out.println("Outro erro: " + e.getMessage());
            }
        }
    }
}
