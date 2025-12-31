package Vetores.Desafio_Pensionato.entities;

public class Aluguel {
    private String nomeDoLocador;
    private String emailLocador;
    private int numQuarto;

    
    public Aluguel() {
    }


    public Aluguel(String nomeDoLocador, String emailLocador, int numQuarto) {
        this.nomeDoLocador = nomeDoLocador;
        this.emailLocador = emailLocador;
        this.numQuarto = numQuarto;
    }


    public String getNomeDoLocador() {
        return nomeDoLocador;
    }



    public void setNomeDoLocador(String nomeDoLocador) {
        this.nomeDoLocador = nomeDoLocador;
    }


    public String getEmailLocador() {
        return emailLocador;
    }



    public void setEmailLocador(String emailLocador) {
        this.emailLocador = emailLocador;
    }


    public int getNumQuarto() {
        return numQuarto;
    }


    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    
}
