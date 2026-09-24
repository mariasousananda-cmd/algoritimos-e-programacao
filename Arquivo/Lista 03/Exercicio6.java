import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha;
        int senhaDigitada;
        int tentativas = 0;

        System.out.println("Cadastre sua senha:");
        senha = input.nextInt();

        System.out.println("Digite sua senha para entrar:");
        senhaDigitada = input.nextInt();
        tentativas++;

        while (senhaDigitada != senha) {

            if (senhaDigitada != senha) {
                System.out.println("Senha Incorreta! Tente novamente:");
                senhaDigitada = input.nextInt();
                tentativas++;
            }
        }
        System.out.println("Aceso autorizado!");
        System.out.println("Número total de tentativas: " + tentativas);

        input.close();
    }
}
