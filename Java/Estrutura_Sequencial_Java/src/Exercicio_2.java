/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. */

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double raio,area;
        double pi = 3.14159; 

        System.out.println("Informe O Valor Do Raio : ");
        raio = input.nextDouble();

        area = pi * raio*raio;

        System.out.println("A Área Total Da Círculo É De: " + String.format("%.4f", area));
    }
}