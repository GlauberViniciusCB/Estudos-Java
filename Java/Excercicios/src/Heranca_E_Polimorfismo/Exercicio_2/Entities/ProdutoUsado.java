package Heranca_E_Polimorfismo.Exercicio_2.Entities;

import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date dataDeFabricacao;


    
    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }


    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiqueta(){
        return super.etiqueta() + "(Data De Fabricação: " + dataDeFabricacao + ")";  
    }

}
