package Orientacao_Objetos.Triangulo;

import java.util.Scanner;

public class Triangulo_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double a,b,c;
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        double areaTotalX,areaTotaly;

        
        System.out.println("Informe O Valor Dos Lados Do Triângulo X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Informe O Valor Dos Lados Do Triângulo Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
        
        areaTotalX = x.calcularArea();
        areaTotaly = y.calcularArea(); 
        
        System.out.println("Área Total De X É : "+ String.format("%.4f", areaTotalX));
        System.out.println("Àrea Total De Y É : " + String.format("%.4f", areaTotaly));
        
        if (areaTotalX > areaTotaly) {
            System.out.println("O Triângulo X É O Maior.");
        }
        else{
            System.out.println("O Triângulo Y É O Maior.");
        }
    }
}
