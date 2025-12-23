package Estrutura_Repeticao_For;
    /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
        exemplo. 
    */ 
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int pot= 1;  
        
        System.out.println("Digite Um Número: ");
        num = input.nextInt();
    
        for (int i = 1; i <= num; i++) {
            pot = 1;
            for (int j = 1; j <= 3; j++) {
                pot = i * pot;
                System.out.print(pot + " ");
            }
            System.out.println();
        }
    }
}
