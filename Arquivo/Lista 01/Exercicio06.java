import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     double salarioAtual;
     double porcentagemDeAumento;
     double valorDoAumento;
     double salarioFinal;

        System.out.println("Digite as informações abaixo para calcular seu aumento!");
        System.out.println("Seu salário atual:");
        salarioAtual = input.nextDouble();

        System.out.println("Você irá receber 20% de aumento, meus parabéns!");
        valorDoAumento = salarioAtual * 0.2;
        System.out.printf("Seu aumento será de: %.2f\n" , valorDoAumento);

        salarioFinal = valorDoAumento + salarioAtual;
        System.out.printf("Seu salário final é de: R$ %.2f" , salarioFinal);

    }
}
