package Vetores;

import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/ 

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0,cont=0;
        double media;

        System.out.println("Quantos Números Deseja Ler ?");
        int n = input.nextInt();

        int [] vetor = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("Informe O " + (i+1) + "° Número: " );
            vetor[i] = input.nextInt();
            if (vetor[i] %2 == 0) {
                soma = soma + vetor[i];
                cont = cont + 1; 
            }
        }

        System.out.println();

        if(cont >= 1){
            media =  soma/cont;
            System.out.printf("Média Dos Pares: " + String.format("%.1f", media));
        }
        else{
            System.out.println("Nenhum Número Par.");
        }

    }
}
