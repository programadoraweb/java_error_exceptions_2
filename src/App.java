public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            int numero = 0;
            String[] matriz = new String[3]; // Matriz de strings
            
           
            // Este da erro pois a matriz so tem 3 elementos
            /* matriz[7]= "elementos da matriz"; */
            /* System.out.println(matriz[3]); */
           /*  System.out.println(matriz[7]); */

            int resultado = 4/ numero;
            System.out.println(resultado);
            // este da erro de divisao por zero - ArithmeticException
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Atencao. Voce tentou dividir por 0 !");
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Atencao, com a Matriz. Ela so tem 3 elementos. Erro!!!");
        }
    }
}
