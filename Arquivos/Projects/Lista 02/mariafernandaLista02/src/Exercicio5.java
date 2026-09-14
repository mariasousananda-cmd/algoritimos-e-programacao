import java.util.Scanner;;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int grau;
    int conversao;
    int fahrenheit;
    int kelvin;


        System.out.println("Coversão de unidade em graus");
        System.out.println("Digite a temperatura em graus Celsius:");
        grau = input.nextInt();

        System.out.println("Agora digite (1) para Fahrenheit e (2) para Kelvin e converta:");
        conversao = input.nextInt();

        fahrenheit = 1;
        kelvin = 2;

        if (conversao <= 1) {
            System.out.println("Em Fahrenheit fica:" + (grau * 1.8 + 32));
        } else {
            System.out.println("Em Kelvin fica:" + (grau + 273 * 15));
        }

    }
}
