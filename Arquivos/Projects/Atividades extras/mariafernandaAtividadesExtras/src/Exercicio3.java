import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        double nota;

        System.out.println("Digite sua nota:");
        nota = input.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        }if (nota >= 0 &&  nota <= 3) {
            System.out.println("Reprovado!");
        } else if (nota >3 && nota <=6) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
