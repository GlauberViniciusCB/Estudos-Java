package Orientacao_Objetos.Retangulo;

public class Retangulo {
    private double largura;
    private double altura;
    
    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        double areaTotal;
        areaTotal = this.largura * this.altura;
        return areaTotal;
    }

    public double perimetro(){
        double perimetroTotal;
        perimetroTotal = (this.altura) * 2  + (this.largura) * 2;
        return perimetroTotal;
    }

    public double diagonal(){
        double diagonal;
        diagonal = Math.sqrt((altura*altura)+(largura*largura));
        return diagonal;
    }

}
