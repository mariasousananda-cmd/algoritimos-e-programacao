import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;

        System.out.println("Digite 3 números e descubra qual deles é maior!");
        System.out.println("Primeiro número:");
        primeiroNumero = input.nextInt();

        System.out.println("Segundo número:");
        segundoNumero = input.nextInt();

        System.out.println("Terceiro número:");
        terceiroNumero = input.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O primeiro número é o maior!" + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("O segundo número é o maior:" + segundoNumero);
        } else {
            System.out.println("O terceiro número é o maior:" + terceiroNumero);

        }
    }
}
