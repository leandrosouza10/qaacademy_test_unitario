package medium;

public class Exercicio4 {
    public void mulitiplicacaoDeNumeros() {
        int i = 1, multiplicacao = 1;
        while (i <= 1000) {
            multiplicacao = multiplicacao * i;
            System.out.println("O resultado da multiplicação é: " + multiplicacao);
            if (multiplicacao >= 1000) {
                multiplicacao = 1; 
                System.out.println("Foi Zerado");
            }// fim do bloco If
            i++;
        } // fim do While

    } // fim main

}// fim da classe
