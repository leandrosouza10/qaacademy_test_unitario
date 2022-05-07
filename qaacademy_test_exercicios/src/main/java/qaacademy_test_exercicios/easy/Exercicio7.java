package easy;


public class Exercicio7 {
    public double calculaInss(double salario) {

        double valorInss = 0.0;             

        if(salario <=1045.00){
            valorInss = salario * 0.075; //7,5%            
            
            }else if (salario >= 1045.01 && salario <= 2089.60){
                valorInss = salario * 0.09; //9%                

                }else if (salario >= 2089.61 && salario <=3134.40){
                  valorInss = salario * 0.12; //12%                 

                    }else if(salario >=3134.41 && salario <=6101.06){
                      valorInss = salario * 0.14; //14%                      

                      }else{
                      valorInss = 854.15; //teto                      
                      } 
                      return valorInss;
    }

}
