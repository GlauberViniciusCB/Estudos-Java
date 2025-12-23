package Vetores.Exercicio_11.entities;

public class DadosPessoas {
    private Double altura;
    private char genero;


    public DadosPessoas(Double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public char getGenero() {
        return genero;
    }


    public void setGenero(char genero) {
        this.genero = genero;
    }

    
    
}
