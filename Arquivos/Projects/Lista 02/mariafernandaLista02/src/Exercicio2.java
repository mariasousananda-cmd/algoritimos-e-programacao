import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double kwh;
        System.out.println("Verifique o preço da sua conta de energia por aqui!");
        System.out.println("Quantidade de Kwh gastos esse mês:");
        kwh = input.nextDouble();

        if (kwh <= 100) {
            System.out.printf("Você pagará esse mês: R$ %.2f",  kwh * 0.50);
        } else if (kwh <= 200) {
            System.out.printf("Você pagará esse mês R$ %.2f", kwh * 0.70);
        } else {
            System.out.printf("Você pagará esse mês R$ %.2f", kwh * 0.90);

        }
    }
}
