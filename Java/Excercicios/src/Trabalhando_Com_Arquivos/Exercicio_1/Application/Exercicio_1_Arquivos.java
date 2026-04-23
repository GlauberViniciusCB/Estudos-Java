package Trabalhando_Com_Arquivos.Exercicio_1.Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Trabalhando_Com_Arquivos.Exercicio_1.Model.Entities.Produto;

public class Exercicio_1_Arquivos {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<String> dadosFinais = new ArrayList<>();
        List<Produto> listaDeProdutos = new ArrayList<>();

        String caminho = "C:\\Users\\Glauber Vinicius\\Documents\\Java\\Java\\Excercicios\\src\\Trabalhando_Com_Arquivos\\Exercicio_1\\produtos.csv";
        String caminhoOut = "C:\\Users\\Glauber Vinicius\\Documents\\Java\\Java\\Excercicios\\src\\Trabalhando_Com_Arquivos\\Exercicio_1";
        String diretoriFinal = "C:\\Users\\Glauber Vinicius\\Documents\\Java\\Java\\Excercicios\\src\\Trabalhando_Com_Arquivos\\Exercicio_1\\Out\\";
        System.out.print("Quantos Produtos Deseja Cadastrar: ");
        int quantDeProdutos  = input.nextInt();

        
        for (int i = 0; i < quantDeProdutos; i++) {
            System.out.println("\nProduto #" + (i+1) + ":");
            
            input.nextLine();
            System.out.print("Nome: ");
            String nomeProduto = input.nextLine();

            System.out.print("Valor Unitário: ");
            Double valorProduto = input.nextDouble();

            System.out.print("Quantidade: ");
            int quantidadeProduto = input.nextInt();

            listaDeProdutos.add(new Produto(nomeProduto, valorProduto, quantidadeProduto));

        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
            for (Produto produto : listaDeProdutos) {
                bw.write(produto.getNome() + "," + produto.getValor() + "," + produto.getQuantidade()  );
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha;
            while ((linha = br.readLine())!= null) {
                String [] dados = linha.split(",");

                double preco = Double.parseDouble(dados[1]);
                
                int quantUnitaria = Integer.parseInt(dados[2]);
                double total = preco * quantUnitaria;

                String totalFormatado = String.format("%.2f", total);
                
                dadosFinais.add(dados[0]+ " " + totalFormatado);
                total = 0;
                totalFormatado = " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

       new File(caminhoOut + "\\Out").mkdir();
       
        

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(diretoriFinal +"summary.csv" ,true))) {
            for (String dado : dadosFinais) {
                bw.write(dado);
                bw.newLine();;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    
        input.close();        
    }
}
