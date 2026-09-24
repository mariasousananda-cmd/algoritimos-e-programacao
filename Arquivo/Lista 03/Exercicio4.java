import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;

        System.out.println("Digite um número para a repetição da frase:");
        numero = input.nextInt();

        for(int i = 0; i <= numero; i++) {
            System.out.println("Praticando lógica de programação!");

        }
    }
}
