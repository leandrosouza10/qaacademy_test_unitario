package medium;

public class Exercicio3 {
    public void somaNumeroAcumulado() {

        int i = 0, soma = 0;
        

        while (i <= 1000) {

            soma = soma + i;
            System.out.println(soma);
            i++;
            if (soma >= 1500) {
                break; // finaliza while (Enquanto)
            } // fecha if (Se)
            

        } //while

    }// fecha main

}// fecha classe
