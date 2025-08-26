package Estrutura_Condicional;

import java.util.Scanner;

/*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
    ordem crescente ou decrescente. 
*/ 

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  valorA, valorB;
        int  res; 

        System.out.println("Informe o Primeiro Valor: ");
        valorA = input.nextInt();

        System.out.println("Informe O Segundo Valor: ");
        valorB = input.nextInt();

        res  = valorA / valorB;

        if(valorA % valorB == 0  || valorB % valorA == 0){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são Multiplos");
        }
    }
}
