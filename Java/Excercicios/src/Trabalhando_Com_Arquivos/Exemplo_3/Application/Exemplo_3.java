package Trabalhando_Com_Arquivos.Exemplo_3.Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo_3 {
    public static void main(String[] args) {
        
        String [] linhas  = new String[] {"Bom Dia","Boa Tarde","Boa Noite"};

        String caminho = "C:\\Users\\Glauber Vinicius\\Documents\\Java\\Java\\Excercicios\\src\\Trabalhando_Com_Arquivos\\Exemplo_3\\Application\\ArquivoTesteCriar.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho) )){
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
