package Estrutura_Repeticao_While;

import java.util.Scanner;

/*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/ 
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha ;
        
        System.out.println("Informe A Senha: ");
        senha = input.nextInt();

        while (senha != 2002) {
            if(senha != 2002){
                System.out.println("Senha Inválida.\nTente Novamente, Digite Senha: ");
                senha = input.nextInt();
            }

        }
        System.out.println("Acesso Permitido.");
    }
}
