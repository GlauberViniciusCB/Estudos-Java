package Enumeracao_E_Composicao.Funcionario.Entities;

import java.util.Date;

public class Contrato {
    private Date data;
    private double valorHora;
    private Integer horas;


    public Contrato() {
    }

    public Contrato(Date data, double valorHora, Integer horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorFinal(){
        double total; 
    
        total = this.horas * this.valorHora; 
        return total;
    }
}
