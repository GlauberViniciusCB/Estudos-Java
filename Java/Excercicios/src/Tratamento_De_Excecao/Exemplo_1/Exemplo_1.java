package Tratamento_De_Excecao.Exemplo_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            String[] vet = input.nextLine().split(" ");
            int pos = input.nextInt();
            System.out.println(vet[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Inválida!");
        } catch (InputMismatchException e) {
            System.out.println("Erro De Input!");
        }
        System.out.println("Programa Finalizado!");

        input.close();
    }
}
