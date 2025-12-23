package Vetores.Desafio_Pensionato.application;

import java.util.Scanner;

import Vetores.Desafio_Pensionato.entities.Estudante;

public class Desafio_Pensionato {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        
        System.out.println("Quantos Quartos Deseja Alugar ? ");
        int numDeQuartos = input.nextInt();
    
        Estudante [] estudantes  = new Estudante[10];

        for (int i = 0; i < numDeQuartos; i++) {

            System.out.println( i + "° Aluguel: ");
            
            System.out.println("Informe O Nome Do Estudante:  ");
            String nomeDoEstudante = input.nextLine();

            input.next();
            
            System.out.println("Informe O Email Do Estudante: ");
            String email = input.nextLine();

            input.next();

            System.out.println("Número DO Quarto Que Desea Alugar: ");
            int numDoQuarto = input.nextInt();
            

            estudantes[numDoQuarto] = new Estudante(nomeDoEstudante, email, numDoQuarto);
            
        }

        for (Estudante estudante : estudantes) {
            if(estudante != null){
                System.out.println(estudante.getNome() + "," +estudante.getEmail());
            }
        }
    }
}
