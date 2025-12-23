package Estrutura_Repeticao_While;
/*
    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/ 
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double coordenadaX,coodernadaY;

        System.out.println("Informe A Coordenada X: ");
        coordenadaX = input.nextInt();

        System.out.println("Informe A Coordenada Y: ");
        coodernadaY = input.nextInt();

        while (coordenadaX !=0 || coodernadaY != 0 ) {
            if (coordenadaX > 0  && coodernadaY > 0) {
                System.out.println("Primeiro");
            }
            else if (coordenadaX < 0 && coodernadaY > 0){
                System.out.println("Segundo");
            }
            else if (coordenadaX < 0 && coodernadaY < 0 ){
                System.out.println("Terceiro");
            }
            else if (coordenadaX > 0 && coodernadaY < 0){
                System.out.println("Quarto");
            }
            else{
                break;
            }

            System.out.println("Informe A Coordenada X: ");
            coordenadaX = input.nextInt();

            System.out.println("Informe A Coordenada Y: ");
            coodernadaY = input.nextInt();
        }
    
    }
}
