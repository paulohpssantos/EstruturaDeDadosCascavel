package ordenacaobolha;

/**
 *
 * @author paulinho
 */
public class OrdenacaoBolha {

    
    public static void main(String[] args) {
        
        int[]vetor = {45,20,33,40,50,2,15,88,8};
        boolean houveTroca = true;
        
        while(houveTroca){
            houveTroca = false;
            
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] > vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    houveTroca = true;
                }
            }
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao ["+i+"] = "+vetor[i]);
            
        }
         
        
    }
    
}
