package Heranca_E_Polimorfismo.Exercicio_2.Entities;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(){

    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public String etiqueta(){
        return nome +  " R$ " + preco;
    }
   
}
