package Vetores;

import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
    mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
    os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/ 
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int quantNum;
        Double somavalor = 0.0 , media;
        System.out.println("Informe A Quantidade De Valores Que Deseja Inserir No Vetor: ");
        quantNum = input.nextInt();

        Double [] vetor  = new Double[quantNum];

        for (int i = 0; i < quantNum; i++) {
            System.out.println("Informe O " + (i+1)+ "° Número Do Vetor: " );
            vetor[i] = input.nextDouble();
            somavalor = somavalor + vetor[i];
        }

        media = somavalor/quantNum; 
        
        System.out.println(media);
        System.out.println("Elementos Abaixo Da Média: ");

        for (int i = 0; i < quantNum; i++) {
            if (vetor[i] < media ) {
                System.out.println(String.format("%.1f", vetor[i]));
            }    
        }
    }
}   