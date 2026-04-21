package Trabalhando_Com_Arquivos.Exemplo_4.Application;

import java.io.File;
import java.util.Scanner;

public class Exemplo_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe O Caminho: ");
        String strCaminho =  input.nextLine();
        
        File caminho = new File(strCaminho);

        
        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File pasta : pastas) {
            System.out.println(pasta);
        } 

        System.out.println("\n");

        File[] arquivos = caminho.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File arquivo: arquivos) {
            System.out.println(arquivo);
        }

        Boolean sucesso = new File(strCaminho + "\\NovaPastaCriadaPorMim").mkdir();
        System.out.println("Diretorio Criado Com Sucesso ?  " + sucesso);
    }
}
