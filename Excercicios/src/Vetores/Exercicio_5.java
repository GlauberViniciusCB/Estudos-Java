package Vetores;

import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior
// elemento, considerando a primeira posição como 0 (zero)

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantNum,posDoMaior = 0;
        Double maiorValor = 0.0;
        
        System.out.println("Informe A Quantidade De Números Que Deseja Digitar: ");
        quantNum = input.nextInt();

        Double [] vetorDeNumeros = new Double[quantNum];

        for(int i=0; i < quantNum; i++ ){
           System.out.println("Informe O "+ (i+1)+ "° Número: ");
           vetorDeNumeros[i] = input.nextDouble(); 
           if (i == 0 ) {
                maiorValor =  vetorDeNumeros[i];
                posDoMaior = i;
            }
           else if (vetorDeNumeros[i] >  maiorValor){
                maiorValor = vetorDeNumeros[i]; 
                posDoMaior = i;
            }
            
        } 

        System.out.println("Maior Valor : "  + maiorValor);
        System.out.println("Posição Do Maior Valor: "  + posDoMaior);

    }
}

