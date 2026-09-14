import java.util.Scanner;

public class Exercicio6 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double numero;

        System.out.println("Digite o núemero aqui:");
        numero = input.nextDouble();

        if (numero % 10 == 0) {
            System.out.println("Núemro divisível por 10!");
        } else if (numero % 5 == 0) {
            System.out.println("Número divisível por 5!");
        } else if (numero % 2 == 0) {
            System.out.println("Número divisível por 2!");
        } else {
            System.out.println("Não é divisível por nenhum deles!");
        }
    }

}
