package Orientacao_Objetos.Triangulo;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double calcularArea(){
        double semiArea,area;
 
        semiArea = (a + b+ c)/2;
        
        area = Math.sqrt(semiArea*(semiArea-a)*(semiArea-b)* (semiArea-c)); 
        return area;
    }

    
    
}
