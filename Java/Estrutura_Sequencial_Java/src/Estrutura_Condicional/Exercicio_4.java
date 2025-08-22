package Estrutura_Condicional;

import java.util.Scanner;

/*    
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim, duracao, resto;

        System.out.println("Qual O Horário De Inicio Do Jogo ? ");
        inicio = input.nextInt();

        System.out.println("Qual O Horário de Finalização Do Jogo ?");
        fim = input.nextInt();

        if (inicio > fim) {
            resto = 24 - inicio;
            duracao = resto + fim;
        } else {
            duracao = fim - inicio;
        }

        System.out.println("O Jogo Durou " + duracao);
    }
}
