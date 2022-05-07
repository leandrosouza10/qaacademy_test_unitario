package easy;

public class Exercicio10 {

    public double calcularValorJuros(double valorInvestimento) {     
           
        double valorJuros = 0.0, txJuros = 0.05, ano =1;
           
        while(ano <= 10){
            valorJuros = valorJuros + (valorInvestimento * txJuros);
            ano ++;
        }
         return valorJuros;       

    }
    
}
