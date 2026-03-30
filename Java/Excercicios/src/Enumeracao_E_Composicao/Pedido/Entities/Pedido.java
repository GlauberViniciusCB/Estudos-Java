package Enumeracao_E_Composicao.Pedido.Entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enumeracao_E_Composicao.Pedido.Entities.Enum.Status;

public class Pedido {

    private  static SimpleDateFormat formatoMomento = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    private Date momento;
    private Status status;

    private Cliente cliente;
    private List<ItensPedido> listaDeItens = new ArrayList<>();

    public Pedido() {
    
    }


    public Pedido(Date momento, Status status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }


    public Date getMomento() {
        return momento;
    }


    public Status getStatus() {
        return status;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void adicionarItem(ItensPedido item){
        listaDeItens.add(item);
    }

    public void removeItem(ItensPedido item){
        listaDeItens.remove(item);
    }

    public double total(){
        double total = 0;
        for (ItensPedido itensPedido : listaDeItens) {
            total = total + itensPedido.subTotal();
        }
        
        return total ;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMomento Do Pedido:" +  formatoMomento.format(momento) );
        sb.append(" \nStatus: " + status);
        sb.append(" \nCliente: " + getCliente().getNome() + " " + getCliente().getDataNascimento()  + " " + getCliente().getEmail());
        sb.append(" \nItens Do Pedido:  ");
        for (ItensPedido itensPedido : listaDeItens) {
            sb.append("\nItem : " +  itensPedido );
        }
        sb.append("\nPreço Total: R$ " );
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    } 

    
    
}
