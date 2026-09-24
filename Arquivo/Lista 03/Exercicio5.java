import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("Impressão da Tabuada!");
            System.out.println("Digite um número, para a impressão ou sair, para parar!:");
            resposta = input.nextLine();

            if (!resposta.equalsIgnoreCase("sair")) {
                int numero = Integer.parseInt(resposta);

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + "X" + i + "=" + numero * i);

                }

            }

        } while (!resposta.equalsIgnoreCase("sair"));
        System.out.println("Impressão finalizada!");
    }
}
