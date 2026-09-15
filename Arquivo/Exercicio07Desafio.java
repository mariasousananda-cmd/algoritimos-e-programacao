import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio07Desafio {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int A;
    int B;
    int ab;
    int ba;

        System.out.println("Digite um valor para A:");
        A = input.nextInt();

        System.out.println("Agora um valor para B:");
        B = input.nextInt();

        ba = A;
        ab = B;

        System.out.println("O novo valor de A será:" + ab);
        System.out.println("E o novo valor para B será:" + ba);



    }
}
