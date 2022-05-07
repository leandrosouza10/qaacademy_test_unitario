package easy;

/*
    Faça um algoritmo para ler duas  notas,
    calcular a média. E SE a média > 5 exibir APROVADO,
    SE a média < 5 exibir REPROVADO, se média = 5 exibir EXAME.
*/

public class Exercicio6 {
    public String calculaMedia(double nota1, double nota2) {
        double media;
    
        media = (nota1 + nota2) / 2;      

        if (media > 5) {
            return  "Você foi APROVADO! Parabéns!!!";
            
        } else if (media < 5) {
            return  "Você foi REPROVADO! Estude mais!!!";
            
        } else {
            return  "Você está de EXAME!";            

        }     

    }

}
