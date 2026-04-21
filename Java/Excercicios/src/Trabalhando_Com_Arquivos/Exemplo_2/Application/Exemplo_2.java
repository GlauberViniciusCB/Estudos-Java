package Trabalhando_Com_Arquivos.Exemplo_2.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo_2 {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\Glauber Vinicius\\Documents\\Java\\Java\\Excercicios\\src\\Trabalhando_Com_Arquivos\\Exemplo_1\\Application\\ArquivoTeste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha = br.readLine();
            while (linha != null ) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
