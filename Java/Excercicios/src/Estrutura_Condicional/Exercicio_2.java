package Estrutura_Condicional;

import java.util.Scanner;

/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/ 

public class Exercicio_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Informe Um Número: ");
        num = input.nextInt();
        
        if (num %2 == 0) {
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }    
    
}
