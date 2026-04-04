package Heranca_E_Polimorfismo.Exercicio_1.Application;

import java.util.ArrayList;
import java.util.Scanner;

import Heranca_E_Polimorfismo.Exercicio_1.Entities.EmpregadoTerceirizado;
import Heranca_E_Polimorfismo.Exercicio_1.Entities.Empregado;

public class ApplicationEmpregado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Empregado> listaEmpregados  = new ArrayList<>();

        System.out.println("Quantos Empregados Deseja Cadastrar: ");
        int quantDeEmpregados = input.nextInt();
        
        for (int i = 0; i < quantDeEmpregados; i++) {
            System.out.println("Informe Dados Empregado "+ (i+1) + " : ");
            input.nextLine();
            
            System.out.print("Empregado Terceirizado (S/N): ");
            String escolha = input.next();
            

            if (escolha.equalsIgnoreCase("s")) {
                
                System.out.print("Nome: ");
                String nomeEmpregado = input.next();

                System.out.print("Horas: ");
                int horasTrabalhadas = input.nextInt();
                
                System.out.print("Valor Por Hora: ");
                double valorPorHora = input.nextDouble();

                System.out.print("Adicional: ");
                double valorAdicional =  input.nextDouble();

                EmpregadoTerceirizado empregado = new EmpregadoTerceirizado(nomeEmpregado, horasTrabalhadas, valorPorHora, valorAdicional);
                listaEmpregados.add(empregado);
                
            }
            else{
                System.out.print("Nome: ");
                String nomeEmpregado = input.next();

                System.out.print("Horas: ");
                int horasTrabalhadas = input.nextInt();
                
                System.out.print("Valor Por Hora: ");
                double valorPorHora = input.nextDouble();

                Empregado empregado  = new Empregado(nomeEmpregado, horasTrabalhadas, valorPorHora);
                listaEmpregados.add(empregado);
            }
        }
        
        System.out.println("\nPagamento: ");
        for (Empregado empregado : listaEmpregados) {
           System.out.println( empregado.toString());
        }

        input.close();
    }
}
