package exemplomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author paulinho
 */
public class ExemploMenu {

    
    public static void main(String[] args) {
        
        int opcao = -1;
        
        while(opcao != 0 ){
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastro Alunos \n" +
                    "2 - Cadastro Professores \n" +
                    "3 - Cadastro de Disciplinas \n" +
                    "4 - Cadastro de Turmas \n" +
                    "0 - Sair"));
            
//            if(opcao == 1){
//                //Executa o método de cadastro de alunos
//            }else if(opcao == 2){
//                //Executa o método de cadastro de professores
//            }else if(opcao == 3){
//                //Executa o método de cadastro de Disciplinas
//            }else if (opcao == 4){
//                //Executa o método de cadastro de Turmas
//            }
            
            switch (opcao) {
                case 1:
                    //Executa o método de cadastro de alunos
                    cadastrarAluno();
                    break;
                case 2:
                    //Executa o método de cadastro de Professores
                    cadastrarProfessor();
                    break;    
                case 3:
                    //Executa o método de cadastro de Diciplinas    
                    cadastrarDisciplina();
                    break;    
                case 4:
                    //Executa o método de cadastro de Turmas
                    cadastrarTurma();
                    break;
                default:
                    break;
            }
            
        }

    }
    
    public static void cadastrarAluno(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Alunos");
    }
    
    public static void cadastrarProfessor(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Professores");
    }
    
    public static void cadastrarDisciplina(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Disciplinas");
    }
    public static void cadastrarTurma(){
        JOptionPane.showMessageDialog(null, "Entrou no Cadastro de Turmas");
    }
  
    
    
    
    
    
    
    
    
    
}
