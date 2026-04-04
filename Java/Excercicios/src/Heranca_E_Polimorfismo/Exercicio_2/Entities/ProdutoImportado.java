package Heranca_E_Polimorfismo.Exercicio_2.Entities;

public class ProdutoImportado extends Produto {
    private Double custoFrete;

    public ProdutoImportado(){
        super();
    }

    
    public ProdutoImportado(String nome, Double preco, Double custoFrete) {
        super(nome, preco);
        this.custoFrete = custoFrete;
    }

    public Double getCustoFrete() {
        return custoFrete;
    }


    public void setCustoFrete(Double custoFrete) {
        this.custoFrete = custoFrete;
    }

    @Override
    public String etiqueta(){
        return  super.etiqueta() + " (Custo Do Frete: " +  String.format("R$ %.2f", custoFrete) +" )";
    }

    public Double totalPreco(){
        double total =  getPreco() + custoFrete;
        return  total;
    }

}
