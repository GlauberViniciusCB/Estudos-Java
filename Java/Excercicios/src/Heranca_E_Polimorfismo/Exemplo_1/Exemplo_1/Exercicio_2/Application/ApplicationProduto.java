package Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exercicio_2.Application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


import Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exercicio_2.Entities.Produto;
import Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exercicio_2.Entities.ProdutoImportado;
import Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exercicio_2.Entities.ProdutoUsado;

public class ApplicationProduto {
    public static void main(String[] args) throws ParseException {
        Scanner  input = new Scanner(System.in);
        DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();


        System.out.println("Informe A Quantidade De Produtos: " );
        int quantDeProdutos = input.nextInt();

        for (int i = 0; i < quantDeProdutos; i++) {
            
            System.out.println("Este Produto É Comum,Usado Ou Importado (C/U/I): " );
            String escolha  = input.next();

            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.next();

            System.out.print("Preço: ");
            Double precoDoProduto =  input.nextDouble();
            input.nextLine();

            if (escolha.equalsIgnoreCase("u")) {
                System.out.print("Data De Fabricação: ");
                Date dataDeFabricacao = dataFormato.parse(input.next());
                Produto produto = new ProdutoUsado(nome, precoDoProduto, dataDeFabricacao);
                listaDeProdutos.add(produto);
            }
            else if(escolha.equalsIgnoreCase("i")) {
                System.out.println("Frete: ");
                Double freteProduto = input.nextDouble();
                
                Produto produto = new ProdutoImportado(nome, precoDoProduto, freteProduto);
                listaDeProdutos.add(produto);
            }else {
                Produto produto = new Produto(nome, precoDoProduto);
                listaDeProdutos.add(produto);
            }
        }

        System.out.println("\nEtiquetas De Preço: ");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto.etiqueta());
        }
    }
}
