package recursivo;

/**
 *
 * @author paulinho
 */
public class Recursivo {

    public static void main(String[] args) {
        
        int contagem = 10;
        System.out.println("Iniciando contagem regressiva");
        
        contagemRegressiva(contagem);
        
    }
    
    public static void contagemRegressiva(int numero){
        
        if(numero == 0){
            System.out.println("Explosão!!!!");
        }else{
            System.out.println(numero);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){}
            
            contagemRegressiva(numero - 1);
        }
        
    }
    
}
