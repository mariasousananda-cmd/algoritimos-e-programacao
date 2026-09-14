import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Vamos ver como sua idade te classifica.");
        System.out.println("Digite aqui:");
        idade = input.nextInt();

        if (idade <= 12) {
            System.out.println("Infatil!");
        } else if (idade <= 17) {
            System.out.println("Juvenil!");
        } else {
            System.out.println("Adulto!");
        }
    }
}
