package Estrutura_Repeticao_For;

import java.util.Scanner;

/*
    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
Lembrando que, por definição, fatorial de 0 é 1. 
*/

public class Exercicio_5_Por_Fazer {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        
        int num,fat=0;

        System.out.println("Informe O Número Para Calcular O Fatorial: ");
        num = input.nextInt();

        for (int i = num; i < args.length; i++) {
            System.out.println();
        }
    }
}