import java.util.Scanner;

import Tratamento_De_Excecao.Exercicio_2.Model.Entities.Conta;
import Tratamento_De_Excecao.Exercicio_2.Model.Exception.ExcetionConta;


public class Application_Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe Os Dados Da Conta: ");
        
        System.out.print("Número: ");
        int numCOnta = input.nextInt();

        input.nextLine();
        System.out.print("Titular: ");
        String nome = input.nextLine(); 

        System.out.print("Saldo Inicial: ");
        Double saldoInicial = input.nextDouble();
         
        System.out.print("Limite De Saque: ");
        Double limiteDeSaque = input.nextDouble();

        Conta conta = new Conta(numCOnta,nome,saldoInicial, limiteDeSaque);

        System.out.print("Informe Uma Quantidade Para Sacar: ");
        Double saque = input.nextDouble();

        try{
            conta.sacar(saque);
            System.out.println("Novo Saldo: " + conta.getSaldo());
        }catch(ExcetionConta e ){
            System.out.println(e.getMessage());
        }

        System.out.println(conta.toString());
        input.close();
    }
}
