package Estrutura_Sequencial;
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C,D;
        int diferenca; 
        
        System.out.println("Informe O Valor De A: ");
        A = input.nextInt();

        System.out.println("Informe O Valor De B: ");
        B = input.nextInt();

        System.out.println("Informe O Valor De C: ");
        C = input.nextInt();
        
        System.out.println("Informe O Valor De D: ");
        D = input.nextInt();

        diferenca = (A*B-C * D);

        System.out.println("Total: " + diferenca);

    }
}
