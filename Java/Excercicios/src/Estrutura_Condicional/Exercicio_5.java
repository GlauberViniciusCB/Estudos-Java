package Estrutura_Condicional;

import java.util.Scanner;
/*
    escreva um programa que leia o código de um item e a quantidade deste item. A 
    seguir, calcule e mostre o valor da conta a pagar.
*/ 
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo,quant;
        double total=0;

        System.out.println("\nInforme O Código Para Comprar Um Produto\n1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada Simples\n5 - Refrigerante");
        codigo = input.nextInt();

        System.out.println("Informe A Quantidade: ");
        quant = input.nextInt();
        
        if (codigo == 1) {
            total = 4.00 * quant; 
        }
        else if(codigo == 2 ){
            total  = 4.50 * quant;
        }
        else if(codigo == 3 ){
            total = 5.00  * quant;
        }
        else if(codigo == 4){
            total = 2.00 * quant;
        }
        else if(codigo == 5){
            total = 1.50  * quant;
        }

        System.out.println( "Total: " + String.format("%.2f", total));

        
    }
}
