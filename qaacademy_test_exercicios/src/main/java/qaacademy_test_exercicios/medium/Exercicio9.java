package medium;

import javax.swing.JOptionPane;

public class Exercicio9 {
        public void nomeNumeroAlunos() {
            String[] nomeAlunos = new String[7];
            int[] numeracaoAlunos = new int[7];
            int i = 0;

            while(i < 7){
                nomeAlunos [i] = recebeAluno();
                numeracaoAlunos [i] = recebeNumeroAluno();
                i++; 
            }
            imprimeNomeNumero(nomeAlunos,numeracaoAlunos);
        }        

        private void imprimeNomeNumero(String [] vetorNomes, int [] vetorAlunos) {
            int i = 0;
            while (i < 7) {
                System.out.println("Nome do aluno: " + vetorNomes[i] + " - " + " número do aluno: " + vetorAlunos[i]);
                i++;
            }
        }

        private String recebeAluno() {
            return JOptionPane.showInputDialog("Digite o nome do aluno: ");
        }

        private int recebeNumeroAluno() {
            return  Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Aluno:"));
        }
    }    
