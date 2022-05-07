package easy;

public class Exercicio8 {

    public double calculaImpostoDeRenda (double salario) {
         double ir = 0;   

        if (salario <= 1903.98) {
            ir = 0;            
            
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.075) - 142.80;           
         
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            ir = (salario * 0.15) - 354.80;
         
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            ir = (salario * 0.225) - 636.13;        
           
        } else if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;                  

        }
        return ir;
    }
    
    public double calculaSalarioLiquido(double salario, double ir) {
        return salario - ir;

    }

}
