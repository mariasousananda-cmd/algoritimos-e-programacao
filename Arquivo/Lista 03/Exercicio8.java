import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeDoacoes;
        double valorDoacao;
        double totalArrecadado = 0;
        double maiorValor = 0;
        double menorValor = 0;

        System.out.print("Digite a quantidade de doações recebidas: ");
        quantidadeDoacoes = input.nextInt();

        for (int i = 1; i <= quantidadeDoacoes; i++) {

            System.out.print("Digite o valor da " + i + "ª doação: ");
            valorDoacao = input.nextDouble();

            totalArrecadado += valorDoacao;

            if (i == 1) {
                maiorValor = valorDoacao;
                menorValor = valorDoacao;
            } else {
                if (valorDoacao > maiorValor) {
                    maiorValor = valorDoacao;
                }

                if (valorDoacao < menorValor) {
                    menorValor = valorDoacao;
                }
            }
        }

        System.out.println("\nTotal arrecadado: R$ " + totalArrecadado);
        System.out.println("Maior doação: R$ " + maiorValor);
        System.out.println("Menor doação: R$ " + menorValor);

        input.close();

        }
    }