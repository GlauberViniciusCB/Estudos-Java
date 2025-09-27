package Orientacao_Objetos.Dolar;

public class Dolar {
    public static final double TAXA_DOLAR = 0.06;

    
    public static double calcularValoPagar(double valorDesejoComprar, double contacaoDolar ){
        double valorPagar; 
        valorPagar = valorDesejoComprar * contacaoDolar;
        return valorPagar; 
    }

    
    
    
}

