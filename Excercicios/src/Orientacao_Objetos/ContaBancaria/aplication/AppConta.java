package Orientacao_Objetos.ContaBancaria.aplication;

import java.util.Scanner;

import Orientacao_Objetos.ContaBancaria.Entities.ContaBancaria;

public class AppConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria contaBancaria;
        
        System.out.println("Informe o Número Da Conta: ");
        int numeroDaConta  = input.nextInt();

        System.out.println("Informe O Nome Do Titular Da Conta: ");
        input.nextLine();
        String titular = input.nextLine();

        System.out.println("Deseja Fazer Deposito Iniciar(S/N)");
        char resposta = input.nextLine().charAt(0);

        if(resposta == 's'){
            System.out.println("Digite O Valor Inicial: ");
            double depositoInial = input.nextDouble();   
            contaBancaria = new ContaBancaria(numeroDaConta, titular, depositoInial);
        }
        else{
            contaBancaria = new ContaBancaria(numeroDaConta, titular);
        }
        System.out.println();
        System.out.println(contaBancaria);
        System.out.println();

        System.out.print("Informe O Valor Do Deposito: ");
        double deposito = input.nextDouble();
        contaBancaria.depositar(deposito);
        System.out.println("Dados Da Conta Atualizado.");
        System.out.println(contaBancaria);

        
        System.out.println("Informe O Valor Para Saque: ");
        double saque = input.nextDouble();
        contaBancaria.saque(saque);;
        System.out.println("Dados Da Conta Atualizado.");
        System.out.println(contaBancaria);


        input.close();
    }
}   
