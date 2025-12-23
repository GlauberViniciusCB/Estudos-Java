package Orientacao_Objetos.Retangulo;

import java.util.Scanner;

public class retangulo_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();

        System.out.println("Informe O Valor Largura Do Retângulo: ");
        double largura = input.nextDouble();
        retangulo1.setLargura(largura);

        System.out.println("Informe O Valor Da Altura Do Retângulo: ");
        double altura =  input.nextDouble();
        retangulo1.setAltura(altura);

        double area = retangulo1.area();
        System.out.println("Área = "  + area);

        double perimetro = retangulo1.perimetro();
        System.out.println("Perimetro = " + perimetro);

        double diagonal = retangulo1.diagonal();
        System.out.println("Diagonal = " + diagonal);

    }
}
