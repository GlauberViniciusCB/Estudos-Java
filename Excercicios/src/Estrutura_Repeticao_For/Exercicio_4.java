package Estrutura_Repeticao_For;

import java.util.Scanner;

/*
    Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
*/ 
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double num, den, resut = 0;

        System.out.println("Quantas Divisões Deseja Fazer");
        n = input.nextInt();

        for (int i = 0; i < n ; i++) {
            
            System.out.println("Informe O Númerador: ");
            num = input.nextDouble();

            System.out.println("Informe O Denominador: ");
            den = input.nextDouble();

            resut = num/den;
            
            if (den != 0) {
                System.out.println("Resultado De "+ num + "/"+ den +" = "+resut);  
            }
            else{
                System.out.println("Divisão Impossivel");
            }
            resut = 0;
        }
    }
}
