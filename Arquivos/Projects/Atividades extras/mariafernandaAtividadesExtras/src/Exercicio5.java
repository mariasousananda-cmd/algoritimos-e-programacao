import java.util.Scanner;

public class Exercicio5 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double A;
        double B;

        System.out.println("Descubra se esses números são divisíveis entre si.");
        System.out.println("Se o número:");
        A = input.nextDouble();

        System.out.println("É divisível por:");
        B = input.nextDouble();

        if (A % B == 0) {
            System.out.println("É divisível!");
        } else {
            System.out.println("Não é divisível!");

        }
    }

}
