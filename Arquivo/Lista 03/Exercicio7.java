import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota = 0;
        int soma = 0;
        int quantidade = 0;

        System.out.println("Acumulador de notas e cálculo de média");


        while (nota >= 0) {
            System.out.println("Digite a nota:");
            nota = input.nextInt();


            if (nota >= 0) {
                quantidade++;
                soma = soma+nota;
            }
        }
        System.out.println("A quantidade de notas válidas  :" + quantidade);
        System.out.printf("A média das notas é: %.2f" , (double)soma/quantidade);

    }
}
