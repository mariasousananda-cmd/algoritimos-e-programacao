import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double codigo;
       double quantidade;
       double precoUnitario = 0;
       double precototal;
       double valorDoDesconto;
       double valoFinal;

        System.out.println("Sistema Emissor de Notas Fiscais");
        System.out.println("Informe o código do produto comprado:");
        codigo = input.nextDouble();

        System.out.println("Agora a quantidade do produto comprado:");
        quantidade = input.nextDouble();


        if (codigo >=1 && codigo <=10) {
            precoUnitario = 10;
        } else if (codigo >=11 && codigo <=20) {
            precoUnitario = 15;
        } else if (codigo >=21 && codigo <=30) {
            precoUnitario = 20;
        } else if (codigo >=31 && codigo <=40) {
            precoUnitario = 30;
        } else {
            System.out.println("Código inválido!");
        }

        // calcula o preço total
        precototal = precoUnitario * quantidade;

            double porcentualDesconto;

            // porcentual de desconto
            if  (precototal <= 250) {
                porcentualDesconto = 0.05;
            } else if (precototal <= 500 ) {
                porcentualDesconto = 0.10;
            } else {
                porcentualDesconto = 0.15;
            }

                valorDoDesconto = precototal * porcentualDesconto;
                valoFinal = precototal - valorDoDesconto;

                System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
                System.out.printf("Preço total da nota: R$ %.2f\n", precototal);
                System.out.printf("Valor do desconto R$ %.2f\n", valorDoDesconto);
                System.out.printf("Preço final da nota R$ %.2f\n", valoFinal);

                input.close();

            }
        }
        
