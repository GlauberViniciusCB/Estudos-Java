package Orientacao_Objetos.Produto;

import java.util.Scanner;

public class produto_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto();
        
        System.out.println("Informe Os Dados Do Produto: ");
        
        System.out.print("Nome: ");
        produto1.nome = input.nextLine(); 

        System.out.print("Preço: ");
        produto1.preco = input.nextDouble();
        
        System.out.print("Quantidade: ");
        produto1.quantidade = input.nextInt();

        System.out.println("\nDados Do Produto\n" + produto1);
        System.out.println("Entre Com O Número Que Deseja Adicionar No Estoque: ");
        int quantAddProduto = input.nextInt();
        produto1.addProduto(quantAddProduto);
        
        System.out.println("\nAtualizando Dados Do Produto: ");
        System.out.println(produto1);

        System.out.println("Entre Com Número Que Extrai Do Estoque: ");
        int quantSubProduto = input.nextInt();
        produto1.removeProduto(quantSubProduto);

        System.out.println("\nAtulizando Dados Do Produto: ");
        System.out.println(produto1);

    }
}
