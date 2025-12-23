package Estrutura_Repeticao_For;

import java.util.Scanner;

/*
    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso. 
*/ 

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        int num;

        System.out.println("Digite Um Número Inteiro Entre 1 A 1000: ");
        num = input.nextInt();
        System.out.println();

        for (int i = 1; i < num ; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }            
        }

    }
}
