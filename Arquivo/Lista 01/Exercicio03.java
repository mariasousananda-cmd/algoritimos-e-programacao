import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int idade;
    int meses;

        System.out.println("Descubra quantos meses você tem em anos de idade.");

        System.out.println("Digite sua idade:");
        idade = input.nextInt();

        meses = idade*12;
        System.out.println("Em meses ao todo são:" + meses);
    }
}
