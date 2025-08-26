package Estrutura_Condicional;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */ 

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Informe Um Número: ");
        num = input.nextInt();

        if (num < 0) {
            System.out.println("Número Negativo!");
        }
        else{
            System.out.println("Número Positivo!");
        }
    }
}
