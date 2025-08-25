package Estrutura_Condicional;

import java.util.Scanner;

/*     
    Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
    de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
    ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
    
    Se o ponto estiver na origem, escreva a mensagem “Origem”. 
    
    Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
    situação.
*/
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double coordernadaX, coordernadaY;

        System.out.println("Informe A Coordenada X : ");
        coordernadaX = input.nextDouble();

        System.out.println("Informe A Coordenada Y : ");
        coordernadaY = input.nextDouble();

        if (coordernadaX == 0 && coordernadaY == 0) {
            System.out.println("Origem");
        } else if (coordernadaX != 0 && coordernadaY == 0) {
            System.out.println("Eixo X");
        } else if (coordernadaY != 0 && coordernadaX == 0) {
            System.out.println("Eixo Y");
        } else if (coordernadaX > 0 && coordernadaY > 0) {
            System.out.println("Q1");
        }
        else if (coordernadaX > 0 && coordernadaY > 0) {
            System.out.println("Q2");
        }else if(coordernadaX < 0 && coordernadaY < 0){
            System.out.println("Q3");
        }else if(coordernadaX > 0 && coordernadaY < 0  ){
            System.out.println("Q4");
        }

    }
}
