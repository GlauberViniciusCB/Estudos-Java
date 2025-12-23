package Estrutura_Repeticao_For;
/*
    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5. 

*/ 
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                    
        int quantNum;
        double num,total=0,mediaPond=0;
        
        System.out.println("Informe Quantos Casos De Teste Deseja Fazer: ");
        quantNum = input.nextInt();

        for (int i = 0; i < quantNum; i++) {
            for (int y = 1; y <= 3; y++) {
                System.out.println("Digite " + y + "° Número: ");
                num = input.nextDouble();
                if (y == 1) {
                    total = num * 2;
                    
                } else if (y == 2) {
                    total = num * 3;
                } else {
                    total = num * 5;
                }
                num = 0;
                mediaPond = mediaPond +  total;
            }
            mediaPond = mediaPond/10;
            System.out.println("Media Ponderada: " + String.format("%.1f", mediaPond)); 
            mediaPond = 0;
        }
    }
}
