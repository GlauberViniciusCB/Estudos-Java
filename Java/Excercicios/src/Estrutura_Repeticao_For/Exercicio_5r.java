package Estrutura_Repeticao_For;

import java.util.Scanner;

/*
    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
Lembrando que, por definição, fatorial de 0 é 1. 
*/

public class Exercicio_5_Por_Fazer {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        
        int num,fat;

        System.out.println("Informe O Número Para Calcular O Fatorial: ");
        num = input.nextInt();

        fat = num ;
        if (num == 0) {
            fat = 1;
        }
        else{
            for (int i = 1; i <= num-1 ; i++ ){
                fat = fat* (num- i);
            }
        }
        
        System.out.println(fat);
    }
}