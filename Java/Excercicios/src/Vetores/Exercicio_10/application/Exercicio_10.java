package Vetores.Exercicio_10.application;

import java.util.Scanner;

import Vetores.Exercicio_10.entities.Aluno;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor.
Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis). */

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe Quantos Alunos Deseja Cadastrar: ");
        int n = input.nextInt();

        Aluno [] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            
            input.nextLine();
            System.out.println("Informe O Nome Do " + (i+1) +"° Aluno:");
            String nome = input.nextLine();
            
            System.out.println("Informe a 1° Nota: ");
            double nota1 = input.nextDouble();

            System.out.println("Informe  a 2° Nota: ");
            double nota2 = input.nextDouble();

           

            alunos[i] = new Aluno(nome, nota1, nota2);

        }

        System.out.println("\nAlunos Aprovados: ");
        for (int i = 0; i < n; i++) {
            Double media = (alunos[i].getNota_1() + alunos[i].getNota_2())/2;
            if(media >= 6.0){
                System.out.println(alunos[i].getNome()) ;
            }
        }

    }
}
