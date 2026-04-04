package Heranca_E_Polimorfismo.Exercicio_3.Entities;

import Heranca_E_Polimorfismo.Exercicio_3.Entities.Enum.Cor;

public class Retangulo extends Forma {
    private Double largura;
    private Double altura;

    public Retangulo(){
        super();
    }    
      

    public Retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }


    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


    @Override
    public Double area(){
        double areaTotal;
        areaTotal = largura * altura;
        return areaTotal;
    }
 }
