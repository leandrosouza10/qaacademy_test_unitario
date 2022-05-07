package medium;

public class Exercicio7_8 {
    public String [] criaVetorMeses() {

        //Exercicio7
        String [] meses;
        meses = new String[12];
     
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

      return meses;

    }

    public void imprimeValorVetor(String[] meses) {
        //Exercicio8
        int i = 0;
        while (i <= 11) {
           System.out.println("Mês: " + (i+1) + " - " + meses[i]);
            i++;
        }
    }

}
