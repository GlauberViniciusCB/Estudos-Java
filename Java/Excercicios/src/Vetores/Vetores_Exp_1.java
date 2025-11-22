package Vetores;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
public class Vetores_Exp_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.println("Quantas Alturas Deseja Ler ? ");
        n = input.nextInt();

        double [] vetor = new double[n];
        
        double media,soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Qual é a "+ (i+1) +"° Altura ?");
            vetor[i] = input.nextDouble();
            soma = soma + vetor[i]; 
        }
       
        media = soma/n;
        System.out.println("A Média Final É : " + String.format("%.2f", media));


        

    }
}
