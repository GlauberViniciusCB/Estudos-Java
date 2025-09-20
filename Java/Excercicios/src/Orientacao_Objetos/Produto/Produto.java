package Orientacao_Objetos.Produto;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double totalNoEstoque(){
        double total;
        total = preco * quantidade;
        return total;
    }

    public void addProduto(int quant ){
       this.quantidade = this.quantidade + quant; 
    }

    public void removeProduto(int quant){
        this.quantidade = this.quantidade - quant;
    }

    public String toString(){
        return "Produto: " + this.nome +", R$" + String.format("%.2f", this.preco) + ", " + this.quantidade + " Unidades" +", " + "Total: R$ " + String.format("%.2f", this.totalNoEstoque())  ; 
    }
}
