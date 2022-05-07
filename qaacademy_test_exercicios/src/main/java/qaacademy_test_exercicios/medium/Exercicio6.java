package medium;



public class Exercicio6 {
    public int calculaFatorial(int fatorial) {
        int i;      
        i = fatorial;
        while (i > 1) {
            fatorial = fatorial * (i - 1);
            i--;
        }       
        return fatorial;
    }

}
