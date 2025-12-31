package Matriz;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        
        int contNegativo = 0;  

        System.out.println("Informe O Valor Da Matriz De Ordem N: ");   
        int n = input.nextInt();

        int [][] matriz  = new int [n][n];

        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                System.out.println("Informe O Valor Da Linha "+ i + " E  Coluna " + j);
                matriz[i][j] = input.nextInt();

                if (matriz[i][j] < 0) {
                    contNegativo = contNegativo + 1;   
                }
            }
        }

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
            
                if(i==j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println("\nQuantidade De Números Negativos: " + contNegativo);
    }
}
