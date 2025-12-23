package Estrutura_Repeticao_For;
/*
    Ler um número inteiro N e calcular todos os seus divisores. 
*/ 
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num; 

        System.out.println("Informe O Número: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 ) {
                System.out.println(i);
            }
        }
    }
}
