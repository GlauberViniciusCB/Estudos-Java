package Estrutura_Condicional;

/*
    Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
 
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo

 
 
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
duas casas decimais.
*/

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, totalImpost = 0;

        System.out.println("Informe Seu Salário: ");
        salario = input.nextDouble();

        if (salario > 4500) {
            totalImpost = totalImpost + (salario - 4500) * 0.28;
            salario = 4500;
        }
        if (salario > 3000) {
            totalImpost = totalImpost + (salario - 3000) * 0.18;
            salario = 3000;
        }

        if (salario > 2000) {
            totalImpost = totalImpost + (salario - 2000) * 0.08;
        }

        if (totalImpost == 0) {
            System.out.println("Isento");
        } else {
            System.out.println("R$ " + String.format("%.2f", totalImpost));
        }
    }
}
