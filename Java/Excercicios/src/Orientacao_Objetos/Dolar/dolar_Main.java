package Orientacao_Objetos.Dolar;

import java.util.Scanner;

public class dolar_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe O Valor De Cotação Do Dolar: ");
        double valorDeContacaoDolar = input.nextDouble();
        
        System.out.println("Quanto Deseja Comprar Em Dolares ? ");
        double valorDesejavelAComprar = input.nextDouble();

        double valorFinal = Dolar.calcularValoPagar(valorDesejavelAComprar,valorDeContacaoDolar);
        valorFinal = (valorFinal + (valorFinal * Dolar.TAXA_DOLAR));
        System.out.println("O Valor A Ser Pago É : R$ "  + String.format("%.2f", valorFinal));
    }
}