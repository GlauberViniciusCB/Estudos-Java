package Trabalhando_Com_Arquivos.Exercicio_1.Model.Entities;

public class Produto {
    private String nome;
    private Double valor;
    private int quantidade;
    

    public Produto(){

    }

    public Produto(String nome, Double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor() {
        return valor;
    }
   
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  getNome() + "," + getValor() + "," +getQuantidade() + "";
    }

    
    
}
