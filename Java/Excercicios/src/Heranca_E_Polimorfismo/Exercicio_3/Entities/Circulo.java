package Heranca_E_Polimorfismo.Exercicio_3.Entities;

import Heranca_E_Polimorfismo.Exercicio_3.Entities.Enum.Cor;

public class Circulo extends Forma {
    private Double raio;

    public Circulo(){
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area(){
        double areaTotal ;
        
        areaTotal = Math.PI * (raio*raio);
        return areaTotal;
    }

}
