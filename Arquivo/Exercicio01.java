import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double numero;
    double dobro;
        System.out.println("Digite um núemro:");
        numero = input.nextDouble();
        dobro = numero*2;
        System.out.println("Seu dobro é:" + dobro);
    }
}
