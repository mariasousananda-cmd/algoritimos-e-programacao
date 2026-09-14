import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float numero;

        System.out.println("Digite um núemro aqui:");
        numero = input.nextFloat();

        if (numero % 2 == 0) {
            System.out.println("Esse número é par!\nE seu quadrado é:" + numero*numero);
        } else {
            System.out.println("Esse número é ímpar!\nE seu cubo é:" + numero*numero*numero);


        }
    }
}
