package Vetores.Vetores_Exp_2.application;

import java.util.Scanner;

import Vetores.Vetores_Exp_2.entities.Produto;

public class Vetores_Exp_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroDeProdutos;
        double media;

        System.out.println("Quantos Produtos Você Deseja Salvar ?");
        numeroDeProdutos = input.nextInt(); 
        input.nextLine();

        Produto[] produtos = new Produto[numeroDeProdutos];
       
        for (int i = 0; i < numeroDeProdutos; i++) {
            
            System.out.println("Informe O Nome Do "+(i+1) +" Produto: ");
            String nome =  input.nextLine();
            
           
            System.out.println("Informe O Preço Do " +(i+1) + " Preço: ");
            double preco = input.nextDouble();
            input.nextLine();

            produtos[i] = new Produto(nome, preco);
        }

        double soma = 0 ;
        for (int i = 0; i < numeroDeProdutos; i++) {
            soma = soma + produtos[i].getPreco();    
        }

        media = soma/numeroDeProdutos;

        System.out.println("O Preço Médio Dos Produtos É: " + media);

        
    }
}
