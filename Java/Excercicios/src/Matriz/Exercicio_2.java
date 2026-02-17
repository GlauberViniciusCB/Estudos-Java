package Matriz;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe A Quantidade De Linhas: ");
        int linhas  = input.nextInt();

        System.out.println("Informe A Quantidade Colunas: ");
        int colunas = input.nextInt();

        
        int [] [] matriz = new int[linhas][colunas];

         int tam = matriz.length;

         System.out.println("tamanho da matriz " + tam);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe O Número Da Possição " + i + " " + j );
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Informe O Número Que Deseja Procurar Na Matriz: ");
        int x = input.nextInt();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (matriz[i][j] == x ) {
                    System.out.println("Posição: " + i + "," + j + " : ");
                    
                    if (matriz[i][j-1] >= 0 ) {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }

                    if(matriz[i][j +1] < matriz.length){
                        System.out.println("Direita: " + matriz[i][j +1]);
                    }
                    
                    if (matriz[i-1][j] >= 0 ){
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }

                    if(matriz[i+1][j] < matriz.length){
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }
    }
}
