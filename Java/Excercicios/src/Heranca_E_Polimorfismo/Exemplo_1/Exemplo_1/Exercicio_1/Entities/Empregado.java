package Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exercicio_1.Entities;


public class Empregado {
    private String nome;
    private Integer horas;
    private Double valorPorHora;


    public Empregado(){

    }


    public Empregado(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getHoras() {
        return horas;
    }


    public void setHoras(Integer horas) {
        this.horas = horas;
    }


    public Double getValorPorHora() {
        return valorPorHora;
    }


    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }


    public Double pagamento(){
       double  totalPagamento = horas * valorPorHora;
        return totalPagamento;
    }


    @Override
    public String toString() {
      return nome + " - " + String.format("R$ %.2f", pagamento());

    }

}
