import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;

        System.out.println("Digite um némero:");
        numero = input.nextDouble();

        if (numero > 0 ) {
            System.out.println("Positivo!");
        } else if (numero < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Neutro!");
        }
    }
}
