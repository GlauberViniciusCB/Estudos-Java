package Vetores.Desafio_Pensionato.application;

import java.util.Scanner;

import Vetores.Desafio_Pensionato.entities.Aluguel;

public class Aluguel_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe Quantos Quartos Deseja Alugar: ");
        int numDeAlugueis = input.nextInt();
        
        Aluguel [] quartosAlugados = new Aluguel[10];
        
        input.nextLine();

        for (int i = 0; i < numDeAlugueis; i++) {
            System.out.println("Informe O Nome Do " +(i+1)  + "° Inquilino:");
            String nomeInq = input.nextLine();

            System.out.println("Informe O Email Do " +(i+1)+ "° Inquilino: ");
            String emailInq = input.nextLine();

            System.out.println("Informe O Número Do Quarto Que Deseja Alugar: ");
            int escDoInq = input.nextInt();

            input.nextLine();
            
            quartosAlugados [escDoInq] = new  Aluguel();
            quartosAlugados[escDoInq].setNomeDoLocador(nomeInq);
            quartosAlugados[escDoInq].setEmailLocador(emailInq);
            quartosAlugados[escDoInq].setNumQuarto(escDoInq);
        }

        System.out.println("Quartos Alugados: ");
        for (Aluguel aluguel : quartosAlugados) {
            if (aluguel != null ) {
                System.out.println(aluguel.getNumQuarto() + " : " + aluguel.getNomeDoLocador() + ", " + aluguel.getEmailLocador());                
            }
        }
    }
}

