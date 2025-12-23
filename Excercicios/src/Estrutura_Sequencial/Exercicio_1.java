package Estrutura_Sequencial;
/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos */

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int num_1, num_2, soma;
        
        System.out.println("Informe O 1° Número: ");
        num_1 = input.nextInt();

        System.out.println("Informe O 2° Número:");
        num_2 = input.nextInt();

        soma =  num_1 + num_2;

        System.out.println("A Soma Dos Valores é : " + soma);
    }
}
