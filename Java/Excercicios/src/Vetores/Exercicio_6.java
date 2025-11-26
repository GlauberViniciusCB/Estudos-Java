package Vetores;

import java.util.Scanner;

// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um  terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
// o vetor C gerado.

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int quantDeNumPorVetor;
        
        System.out.println("Quantos Valores Deseja Ter Em Cada Vetor: ");
        quantDeNumPorVetor = input.nextInt();

        int [] vetorA = new int [quantDeNumPorVetor];
        int [] vetorB = new int [quantDeNumPorVetor];
        int [] vetorC = new int [quantDeNumPorVetor];

        for (int i = 0; i < quantDeNumPorVetor; i++) {
            System.out.println("Informe O "+ (i+1) + "° Número Do Vetor A: ");
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < quantDeNumPorVetor; i++) {
            System.out.println("Informe O "+ (i+1) + "° Número Do Vetor B: ");
            vetorB[i] = input.nextInt();
        }
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i]; 
            System.out.println(vetorC[i]);
        }
        
    }
}
