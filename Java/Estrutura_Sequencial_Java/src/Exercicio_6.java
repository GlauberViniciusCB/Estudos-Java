/* 
 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B.  
 
*/

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b,c;
        double areaTriang, areaCirc, areaTrap, areaQuad, areaRet;
        double pi = 3.14159;

        System.out.println("Informe O Valor De A: ");
        a = input.nextDouble();

        System.out.println("Informe O Valor De B: ");
        b = input.nextDouble();

        System.out.println("Informe O Valor De C: ");
        c = input.nextDouble();

        areaTriang = a * c/2;
        areaCirc = pi * (c*c);
        areaTrap = (a + b)* c/2;
        areaQuad = b*b;
        areaRet = a*b;

        System.out.println("\nTriângulo: " +  String.format("%.3f", areaTriang));
        System.out.println("Circulo: " + String.format("%.3f", areaCirc));
        System.out.println("Trapezio:" + String.format("%.3f", areaTrap));
        System.out.println("Quadrado: " + String.format("%.3f", areaQuad));
        System.out.println("Retângulo: " + String.format("%.3f", areaRet));
    }
}
