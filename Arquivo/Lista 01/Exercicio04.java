import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double preco;
    double desconto;

        System.out.println("Digite o preço do porduto:");
        preco = input.nextDouble();
        desconto = preco *0.9;
        System.out.println("Com o desconto de 10% no preço do produto, você paga: R$ " + desconto);
    }
}
