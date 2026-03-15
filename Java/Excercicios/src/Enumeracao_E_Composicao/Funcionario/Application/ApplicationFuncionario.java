package Enumeracao_E_Composicao.Funcionario.Application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Enumeracao_E_Composicao.Funcionario.Entities.Contrato;
import Enumeracao_E_Composicao.Funcionario.Entities.Departamento;
import Enumeracao_E_Composicao.Funcionario.Entities.Funcionario;
import Enumeracao_E_Composicao.Funcionario.Entities.Enum.SenioridadeProfissional;

public class ApplicationFuncionario {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);

        System.out.print("Informe O Departamento Do Funcionario: ");
        String nomeDep = input.nextLine();

        System.out.println("Informe Os Dados Do Funcionário: ");

        System.out.print("Nome: ");
        String nomeFuncionario = input.nextLine();

        System.out.print("Senioridade: ");
        String nivel = input.nextLine();

        System.out.print("Informe A Base Salarial: ");
        Double salarioBase = input.nextDouble();

        Funcionario funcionario = new Funcionario(
                nomeFuncionario,
                SenioridadeProfissional.valueOf(nivel),
                salarioBase,
                new Departamento(nomeDep));

        System.out.print("Quantos Contratos O Funcionário " + nomeFuncionario + " possui? ");
        int numContratos = input.nextInt();

        for (int i = 0; i < numContratos; i++) {

            System.out.println("Informe os dados do contrato #" + (i + 1));

            System.out.print("Data (dd/MM/yyyy): ");
            Date contratoData = dataFormatada.parse(input.next());

            System.out.print("Valor por hora: ");
            double valorPorHora = input.nextDouble();

            System.out.print("Duração (horas): ");
            int horas = input.nextInt();

            Contrato contrato = new Contrato(contratoData, valorPorHora, horas);
            funcionario.adicionarContrato(contrato);
        }

        System.out.print("Informe o mês e ano para calcular o salário (MM/yyyy): ");
        String mesEano = input.next();

        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));

        System.out.println();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNomeDepartamento());
        System.out.println("Ganho no mês " + mesEano + ": "
                + String.format("%.2f", funcionario.renda(ano, mes)));

       
    }
}