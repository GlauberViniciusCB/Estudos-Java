package Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exemplo_1.Application;

import Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exemplo_1.Entities.Conta;
import Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exemplo_1.Entities.ContaParaEmpresas;
import Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exemplo_1.Entities.ContaPoupanca;

public class Exemplo_1_Application {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1001, "Alex", 1000.0);
        conta.sacar(200.0);
        System.out.println(conta.getSaldo());
        
        Conta conta2 = new  ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.sacar(200.0);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaParaEmpresas(1003, "Bob", 1000.0,500.0);
        conta3.sacar(200.0);
        System.out.println(conta3.getSaldo());
    }
}