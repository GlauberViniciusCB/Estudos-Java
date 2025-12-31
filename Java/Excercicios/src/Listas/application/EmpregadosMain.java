package Listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Listas.entities.Empregado;

public class EmpregadosMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Empregado> listadeFuncionararios = new ArrayList<>();

        System.out.println("Informe Quantos Funcionários Quer Cadastrar: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            
            System.out.println("Informe o ID Do Funcionário: " + (i+1) + "°");
            int numID = input.nextInt();
            
            input.nextLine();

            System.out.println("Informe O Nome Do Funcionario: ");
            String nomeFuncionario = input.nextLine();

            System.out.println("Salario: ");
            Double salarioFun = input.nextDouble();

            input.nextLine();
            
            Empregado funcionario = new Empregado(numID, nomeFuncionario, salarioFun);  
            
            listadeFuncionararios.add(funcionario);

        }

        System.out.println("Digite O Id Do Funcionário Que Vai Receber A Bonificação No Salário : ");
        Integer  idDeAumento = input.nextInt();

        while (!Empregado.validaID(listadeFuncionararios, idDeAumento)) {
            System.out.println("Esse Id Não Existe, Tente Novamente: ");
            idDeAumento= input.nextInt();
        
        }


        System.out.println("Digite A Porcentagem De Aumento: ");
        double porcetagemAum = input.nextDouble();


        for (Empregado empregado : listadeFuncionararios) {
            if (idDeAumento.equals(empregado.getId())) {
                empregado.aumento(empregado.getSalario(), porcetagemAum);
            }
        }
        

        System.out.println("Lista De Empregados: ");
        for (Empregado empregado : listadeFuncionararios) {
            System.out.println(empregado.toString());
        }
    
    }
}
