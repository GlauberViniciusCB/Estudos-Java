package Orientacao_Objetos.Aluno;

import java.util.Scanner;

public class aluno_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe O Nome Do Aluno: ");
        String nomeAluno =  input.nextLine();
        aluno.setNome(nomeAluno);
        
        System.out.println("Informe A 1° Nota: ");
        double primeraNota = input.nextDouble();
        aluno.setNota_1(primeraNota);

        System.out.println("Informe A 2° Nota: ");
        double segundaNota = input.nextDouble();
        aluno.setNota_2(segundaNota);


        System.out.println("Informe A 3° Nota: ");
        double terceiraNota = input.nextDouble();
        aluno.setNota_3(terceiraNota);

        double finalMedia = aluno.calculaMedia(primeraNota, segundaNota, terceiraNota);
        String resultadoFinal = aluno.determinaAprovacao(finalMedia);

        System.out.println("\n" + resultadoFinal);
        
        input.close();
    }
}
