import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double renda;
        double pretacao;

        System.out.println("Verificação de elegibilidade para financiamento bancário");
        System.out.println("Informe sua renda mensal:");
        renda = input.nextDouble();

        System.out.println("Qual o valor que deseja pagar da pretação?");
        pretacao = input.nextDouble();

        if (pretacao > 3000 && renda < 10000) {
            System.out.println("Financiamento negado por baixa renda!");
        } else if (pretacao > renda *0.3) {
            System.out.println("Financiamento negado por alta prestação!");
        } else {
            System.out.println("Financiamento aprovado!");
        }
    }
}
