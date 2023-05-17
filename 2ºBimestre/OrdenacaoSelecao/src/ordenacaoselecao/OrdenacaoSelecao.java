package ordenacaoselecao;

import javax.swing.JOptionPane;

/**
 *
 * @author paulinho
 */
public class OrdenacaoSelecao {

    
    public static void main(String[] args) {
        
        int[]vetor = {45,20,33,40,50,2,15,88,8};
        
        for(int i = 0; i < vetor.length-1; i++){
            int posicaoMenor = i;
            
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            
            if(posicaoMenor != i){
                int aux = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = aux;
            }
        }
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("posicao ["+i+"] = "+vetor[i]);
        }
     
    }
    
}
