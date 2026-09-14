import java.util.Scanner;

public class Exercicio7 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double numero;

        System.out.println("Digite o número aqui:");
        numero = input.nextDouble();

        if ( numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("Ele é divisível por 3 e por 7!");

        } else {
            System.out.println("Não é divisível por 3 e por 7 ao mesmo tempo!");
        }
    }
}
