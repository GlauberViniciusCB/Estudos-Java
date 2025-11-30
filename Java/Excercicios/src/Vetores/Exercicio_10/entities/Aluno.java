package Vetores.Exercicio_10.entities;

public class Aluno {
    private String nome;
    private Double nota_1;
    private Double nota_2;

    public Aluno(String nome, Double nota_1, Double nota_2) {
        this.nome = nome;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota_1() {
        return nota_1;
    }

    public void setNota_1(Double nota_1) {
        this.nota_1 = nota_1;
    }

    public Double getNota_2() {
        return nota_2;
    }

    public void setNota_2(Double nota_2) {
        this.nota_2 = nota_2;
    }
    
    
    
}
