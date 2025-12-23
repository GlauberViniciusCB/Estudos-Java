package Vetores;
/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero = 0;
       

        System.out.println("Informe A Quantidade de Números Que Deseja Armazenar");
        numero = input.nextInt();

        int [] vet = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("Informe o "+ (i+1)+"° Número: " );
            vet[i] = input.nextInt();
        }
        
        System.out.println("\nNúmeros Negativos: ");
        for (int i = 0; i < numero; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }

    }
}
