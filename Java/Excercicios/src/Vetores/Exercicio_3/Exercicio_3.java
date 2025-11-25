package Vetores.Exercicio_3;

import java.util.Scanner;

/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na  tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
com menos de 16 anos,  bem como os nomes dessas pessoas caso houver. */

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantNum;
        double alturaMedia = 0; 

        System.out.println("Informe Quantas Pessoas Deseja Cadastrar ? ");
        quantNum = input.nextInt();

        Pessoa [] pessoas = new Pessoa[quantNum];
        
        for (int i = 0; i < quantNum; i++) {
            
            input.nextLine();
            System.out.println("Informe O Nome Da " + (i+1) +"° Pessoa: " );
            String nome = input.nextLine();

            System.out.println("Informe A Idade Da " + (i+1) +"° Pessoa: ");
            int idade = input.nextInt();

            System.out.println("Infome A Altura Da " +(i+1) +"° Pessoa: ");
            double altura = input.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            alturaMedia = alturaMedia + pessoas[i].getAltura();
            

        }

        System.out.println("Soma Das Alturas " + alturaMedia);



        // for (int i = 0; i < quantNum; i++) {
        //     System.out.println(pessoas[i].getNome() + " " + pessoas[i].getIdade() + " " + pessoas[i].getAltura() );
        // }
        


        


        
    }
}
