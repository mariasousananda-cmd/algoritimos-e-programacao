import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double peso;
    double altura;
    double imc;

        System.out.println("Digite seu peso:");
        peso = input.nextDouble();

        System.out.println("Digite sua altura:");
        altura = input.nextDouble();

        if (altura > 3) {
            altura = altura / 100;
        }

        imc = peso/(altura *altura);
        System.out.printf("Seu IMC é de:%.2f", imc);

    }
}
