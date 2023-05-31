package ordenacaoselecao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author paulinho
 */
public class OrdenacaoSelecao {

    
    public static void main(String[] args) {
        
        
        
        //int[]vetor = {45,20,33,40,50,2,15,88,8};
        
        //Gera um vetor com números aleatórios
        Random gerador = new Random();
        int[] vetor = new int[100000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt();
            
        }
        
        long inicio = System.currentTimeMillis();
        
        
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
        
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("posicao ["+i+"] = "+vetor[i]);
        }
        System.out.println("Tempo de execução: "+tempoExecucao);
        
        
     
    }
    
}
