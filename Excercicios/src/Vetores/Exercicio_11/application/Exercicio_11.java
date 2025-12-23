package Vetores.Exercicio_11.application;

/*
    Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das 
    mulheres, e o número de homens.
*/ 
import java.util.Scanner;

import Vetores.Exercicio_11.entities.DadosPessoas;

public class Exercicio_11 {
    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in);

        double maiorAltura = 0.0, menorAltura = 0.0 ,mediaAturaMulheres = 0.0,somaAlturaF= 0.0;
        int contHomem = 0,contFemin = 0;


        System.out.println("Informe Quantas Pessoas Deseja Cadastrar: ");
        int n = input.nextInt();

        DadosPessoas [] dados = new DadosPessoas[n];

        for (int i = 0; i < n; i++) {
            
            input.nextLine();
            
            System.out.println("Informe A Altura Da " + (i+1) + "° Pessoa: ");
            Double altura = input.nextDouble();

            System.out.println("Informe O Genero Da " + (i+1) + "° Pessoa: ");
            char genero = input.next().charAt(0);

            dados[i] = new DadosPessoas(altura, genero);

            if (i == 0) {
                maiorAltura = dados[i].getAltura();
                menorAltura = dados[i].getAltura();
            }
            else if(dados[i].getAltura() > maiorAltura ){
                maiorAltura = dados[i].getAltura();
            }

            if(dados[i].getAltura() < menorAltura ){
                menorAltura = dados[i].getAltura();
            }

            if (dados[i].getGenero() == 'f') {
                somaAlturaF = somaAlturaF + dados[i].getAltura();
                contFemin = contFemin +1;
            }
            else{
                contHomem = contHomem + 1; 
            }
        }

        mediaAturaMulheres = somaAlturaF/contFemin;

        System.out.println("Manor Altura: " + menorAltura);
        System.out.println("Maior Altura: " + maiorAltura);
        System.out.println("Média Das Alturas Das Mulheres: " + String.format("%.2f", mediaAturaMulheres));
        System.out.println("Número De Homens: " + contHomem);

    }
}
