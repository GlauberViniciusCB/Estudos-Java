package Vetores;

import java.util.Scanner;

/*
    Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
    tela todos os números pares, e também a quantidade de números pares.
*/ 
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int quantNum,contPar = 0;

        System.out.println("Informe A Quantidade De Números Que Deseja Armazenar");
        quantNum = input.nextInt();

        int [] vetorDeNumeros = new int[quantNum];

        for (int i = 0; i < quantNum; i++) {
            System.out.println("Informe O " +  (i+1) + "° Número: " );
            vetorDeNumeros[i] = input.nextInt();
        }

        System.out.print("Números Pares: ");
        for (int i = 0; i < quantNum; i++) {
            if (vetorDeNumeros[i] % 2 == 0) {
                contPar = contPar + 1 ;  
                System.out.print(vetorDeNumeros[i] + " ");
            }
        }

        System.out.println("\nQuantidade De Números Par: " + contPar); 
        input.close();
    }
}
