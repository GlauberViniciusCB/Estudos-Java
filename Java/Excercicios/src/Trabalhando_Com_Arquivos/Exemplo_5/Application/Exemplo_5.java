package Trabalhando_Com_Arquivos.Exemplo_5.Application;

import java.io.File;
import java.util.Scanner;

public class Exemplo_5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe O Caminho Da Pasta: ");
        String strCaminho = input.nextLine();

        File caminho = new File(strCaminho);

        System.out.println("Nome Do Arquivo : "  + caminho.getName());
        System.out.println("Caminho Do Arquivo: " + caminho.getPath());
        System.out.println("Caminho Absoluto Do Arquivo: " + caminho.getAbsolutePath() );

        input.close();
    }
}
