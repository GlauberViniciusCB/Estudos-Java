import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {
        
        File arquivo = new File("C:\\Users\\Glauber Vinicius\\Documents\\Java\\Java\\Excercicios\\src\\Trabalhando_Com_Arquivos\\Exemplo_1\\Application\\ArquivoTeste.txt");
        Scanner input = null;

        try {
            input = new Scanner(arquivo);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            if(input!= null){
                input.close();
            }
        }
        
    }
}
