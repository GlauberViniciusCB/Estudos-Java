/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codProd1,codProd2; 
        int quantProd1, quantProd2; 
        double precoUniProd1, precoUniProd2;
        double totalPagamento;

        System.out.println("Digite O Código Do Produto 1: ");
        codProd1 = input.nextInt();

        System.out.println("Digite A Quantidade Do Produto 1:");
        quantProd1 = input.nextInt();

        System.out.println("Qual O Valor Unitário Do Produto 1: ");
        precoUniProd1 = input.nextDouble();

        System.out.println("Digite O Código Do Produto 2: ");
        codProd2 = input.nextInt();

        System.out.println("Digite A Quantidade DO Produto 2: ");
        quantProd2 = input.nextInt();

        System.out.println("Qual O Valor Unitário Do Produto 2: ");
        precoUniProd2 = input.nextDouble();

        totalPagamento = quantProd1 * precoUniProd1  + quantProd2 * precoUniProd2;

        System.out.println("O Valor A Pagar : " + String.format("%.2f", totalPagamento));

    }
}
