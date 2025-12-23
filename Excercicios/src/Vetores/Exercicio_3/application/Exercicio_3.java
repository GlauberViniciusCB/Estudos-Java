package Vetores.Exercicio_3.application;

import java.util.Scanner;

import Vetores.Exercicio_3.entities.Pessoa;

/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na  tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
com menos de 16 anos,  bem como os nomes dessas pessoas caso houver. */

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantNum ,totalDeMenores = 0;
        double alturaMedia = 0,porcentagemMenor = 1; 

        System.out.println("Informe Quantas Pessoas Deseja Cadastrar : ");
        quantNum = input.nextInt();

        Pessoa [] pessoas = new Pessoa[quantNum];
        
        for (int i = 0; i < quantNum; i++) {
            
            input.nextLine();
            System.out.println("Informe O Nome Da " + (i+1) +"° Pessoa: " );
            String nome = input.nextLine();

            System.out.println("Informe A Idade Da " + (i+1) +"° Pessoa: ");
            int idade = input.nextInt();

            System.out.println("Informe A Altura Da " +(i+1) +"° Pessoa: ");
            double altura = input.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            alturaMedia = alturaMedia + pessoas[i].getAltura();

            if(pessoas[i].getIdade() < 16 ){
                totalDeMenores = totalDeMenores + 1;
            }

        }

        porcentagemMenor =  (totalDeMenores * 100)/(quantNum * porcentagemMenor);  
        
        System.out.println("\nAltura Média: " + String.format("%.2f",alturaMedia/quantNum));
        System.out.println("Pessoas Com Menos De 16 Anos: "+ porcentagemMenor + "%");
        
        for (int i = 0; i < quantNum; i++) {
            if (pessoas[i].getIdade()< 16) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}
