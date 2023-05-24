package somarrecursiva;

/**
 *
 * @author paulinho
 */
public class SomarRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = calcularSoma(0);
        System.out.println("A soma dos números de 0 a 50 é: " + resultado);
    }
    
    public static int calcularSoma(int inicio) {
        if (inicio == 50) {
            return inicio;
        } else {
            return inicio + calcularSoma(inicio + 1);
        }
    }
    
}
