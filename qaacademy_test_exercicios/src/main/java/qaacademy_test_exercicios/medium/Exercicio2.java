package medium;

public class Exercicio2 {
    public double calculaInvestimentoJurosCompostos( double valorInvestimento) {

        double txJuros = 0.05, totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        totalAtualizadoComJuros = valorInvestimento;
        while (ano <= tempoInvestido) {
            totalAtualizadoComJuros = (totalAtualizadoComJuros * txJuros) + totalAtualizadoComJuros;
            ano++;
        }
        return totalAtualizadoComJuros - valorInvestimento;
    }// fim

    public double calculaValorTotalDoInvestimento(double valorInvestimento, double valorJuros) {
        return  valorInvestimento + valorJuros;
    }

}
