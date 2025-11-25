package Vetores;
/*
    Faça um programa que leia N números reais e armazene-os em um vetor.
     Em seguida:
      - Imprimir todos os elementos do vetor 
      - Mostrar na tela a soma e a média dos elementos do vetor 
*/ 

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int quantNumeros;
        
        System.out.println("Quantos Números Deseja Inserir ?");
        quantNumeros = input.nextInt();

        Double [] vet = new Double[quantNumeros];
        Double soma = 0.0,media;
        
        for (int i = 0; i < quantNumeros; i++) {
            System.out.println("Digite O " + (i+1) + "° Número: ");
            vet[i] = input.nextDouble();
            soma = soma + vet[i];
        }

        System.out.println("\nValores = ");
        for (int i = 0; i < quantNumeros; i++) {
            System.out.print(vet[i] + " ");
        }

        media = soma/quantNumeros;

        System.out.println("\nSoma = " + soma);
        System.out.println("Media = " + media);


    }
}
