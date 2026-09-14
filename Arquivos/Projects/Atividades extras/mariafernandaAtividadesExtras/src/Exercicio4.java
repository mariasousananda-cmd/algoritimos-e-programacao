import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double compra;
        double desconto;

        System.out.println("Digite o valor da compra abaixo e descubra seu desconto!");
        System.out.println("Preço R$:");
        compra = input.nextDouble();

        desconto = compra *0.9;

        if (compra >= 100) {
            System.out.printf("O total da sua compra fica em: R$ %.2f " , desconto);
        } else {
            System.out.println("Sem desconto para esse preço!");
        }
    }
}
