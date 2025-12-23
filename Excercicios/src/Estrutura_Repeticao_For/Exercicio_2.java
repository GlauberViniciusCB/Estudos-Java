package Estrutura_Repeticao_For;

import java.util.Scanner;

/*  
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). 
*/ 
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quntNum,num;
        int contIn=0,contOut=0;

        System.out.println("Quantos Números Deseja Inserir ?");
        quntNum = input.nextInt();

        for (int i = 1; i <= quntNum; i++) {
            System.out.println("Digite O "+ i +"° Número: ");
            num = input.nextInt();
           if (num >= 10 && num <=20) {
                contIn = contIn + 1; 
            }
            else{
                contOut = contOut + 1 ; 
            }
        }
        System.out.println(contIn+" In");
        System.out.println(contOut + " Out");
    }
}
