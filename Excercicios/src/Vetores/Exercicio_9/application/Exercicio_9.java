package Vetores.Exercicio_9.application;

import java.util.Scanner;

import Vetores.Exercicio_9.entities.Pessoa;

public class Exercicio_9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe Quantas Pessoas Deseja Cadastrar: ");
        int numDePessoa = input.nextInt();
        
        int pessoaComMaiorIdade = 0;
        String nomeComMaiorIdade = "" ;

        Pessoa [] vetorDePessoas = new  Pessoa[numDePessoa];
        
        for (int i = 0; i < numDePessoa; i++) {
            
            input.nextLine();

            System.out.println("Informe O Nome Da " +(i+1) +"° Pessoa: ");
            String nome = input.nextLine();

            System.out.println("Informe A Idade :");
            int idade = input.nextInt();

            vetorDePessoas[i] = new Pessoa(nome,idade);

            if(i == 0 ){
                pessoaComMaiorIdade = vetorDePessoas[i].getIdade(); 
                nomeComMaiorIdade = vetorDePessoas[i].getNome();
            }
            else if(vetorDePessoas[i].getIdade() > pessoaComMaiorIdade ) {
                pessoaComMaiorIdade = vetorDePessoas[i].getIdade(); 
                nomeComMaiorIdade = vetorDePessoas[i].getNome();
            }
        }
        
        System.out.println("Pessoa que tem a maior idade é : " + nomeComMaiorIdade);
       

    }
}
