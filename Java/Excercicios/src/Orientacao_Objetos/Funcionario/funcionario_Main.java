package Orientacao_Objetos.Funcionario;

import java.util.Scanner;

public class funcionario_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Informe O Nome Do Funcionário: ");
        String nome = input.nextLine();
        funcionario.setNome(nome);
        
        System.out.println("Informe o Salário Bruto Do Funcionário: ");
        double salarioBruto = input.nextDouble();
        funcionario.setSalarioBruto(salarioBruto);

        System.out.println("Informe A Taxa De Desconto: ");
        double taxaDesc = input.nextDouble();
        funcionario.setTaxaImposto(taxaDesc);
        
        System.out.println(funcionario);
        System.out.println("Qual é a Porcentagem De Aumento De Salário Do Funcionário ");
        double porcentagemDeAumento  = input.nextDouble();
        funcionario.incrementaSalario(porcentagemDeAumento);

        System.out.print("Atualizando Dados: " + funcionario);
    }
}
