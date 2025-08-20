/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais*/

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double recPorHora;
        double totalSalario;

        System.out.println("Informe O Número Do Funcionário : ");
        numFuncionario = input.nextInt();

        System.out.println("Informe O Total De Horas Trabalhadas : ");
        horasTrabalhadas = input.nextInt();

        System.out.println("Informe O Valor Recebido Por Hora: ");
        recPorHora = input.nextDouble();

        totalSalario = horasTrabalhadas * recPorHora;

        System.out.println("O Número Do Funcionário É: " + numFuncionario);

        System.out.printf("O Salário Do Funcionãrio É De: " + String.format("%.2f", totalSalario));

    }
}
