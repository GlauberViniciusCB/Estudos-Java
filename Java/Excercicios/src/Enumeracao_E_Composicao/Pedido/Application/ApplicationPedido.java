package Enumeracao_E_Composicao.Pedido.Application;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Enumeracao_E_Composicao.Pedido.Entities.Cliente;
import Enumeracao_E_Composicao.Pedido.Entities.ItensPedido;
import Enumeracao_E_Composicao.Pedido.Entities.Pedido;
import Enumeracao_E_Composicao.Pedido.Entities.Produto;
import Enumeracao_E_Composicao.Pedido.Entities.Enum.Status;


public class ApplicationPedido {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe Os Dados Do Cliente: ");
        
        System.out.print("Nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Email: ");
        String emailCliente = input.next();

        System.out.print("Data De Aniversário: ");
        Date dataAniversarioCliente = formatoData.parse(input.next());

        Cliente cliente = new Cliente(nomeCliente, emailCliente, dataAniversarioCliente);

        System.out.println("Informe Os Dados Do Pedido: ");
        
        System.out.print("Status:  ");
        Status status  = Status.valueOf(input.next());

        System.out.print("Quantos Itens O Pedido Tem: ");
        int quantItensPedido = input.nextInt();

        Pedido pedido = new Pedido(new Date(), status, cliente); 

        for (int i = 0; i < quantItensPedido; i++) {
            System.out.println("Informe O Dados Do " + (i+1)  + "° Item " );
            
            System.out.print("Nome Do Produto: ");
            input.nextLine();
            String nomeProduto = input.nextLine();
            
            System.out.print("Valor Do Produto: ");
            double valorProduto = input.nextDouble();

            System.out.print("Quantidade: ");
            int quantProduto = input.nextInt();

            Produto produto  = new Produto(nomeProduto, valorProduto); 
            ItensPedido itemPedido = new ItensPedido(quantProduto, valorProduto, produto);
            
            pedido.adicionarItem(itemPedido);

        }

        System.out.println(pedido);
    }
}
