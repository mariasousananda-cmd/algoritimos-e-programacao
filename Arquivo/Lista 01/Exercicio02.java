import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numeroUm;
    int numeroDois;
    int numeroTres;
    int soma;
    int media;

        System.out.println("Digite três números abaixo.");
        System.out.println("Primeiro número:");
        numeroUm = input. nextInt();

        System.out.println("Segundo número:");
        numeroDois = input.nextInt();

        System.out.println("Terceiro número:");
        numeroTres = input.nextInt();

        soma = numeroUm + numeroDois + numeroTres;
        System.out.println("A soma deles é igual a:" + soma);

        media = soma/3;
        System.out.println("E sua média aritimética é:" + media);
    }
}

