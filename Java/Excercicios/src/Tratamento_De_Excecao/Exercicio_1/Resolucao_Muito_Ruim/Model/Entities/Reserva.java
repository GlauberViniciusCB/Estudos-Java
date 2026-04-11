package Tratamento_De_Excecao.Exercicio_1.Resolucao_Muito_Ruim.Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reserva {
    private Integer numeroQuarto;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");    

    public Reserva(){

    }

    public Reserva(Integer numeroQuarto, Date checkin, Date checkout) {
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckin() {
        return checkin;
    }

   

    public Date getCheckout() {
        return checkout;
    }

    public Long duracao(){
        long diferenca  = checkout.getTime() - checkin.getTime(); 
        
        return TimeUnit.DAYS.convert(diferenca,TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Quarto: " + numeroQuarto + ", Checkin: " + dataFormatada.format(checkin) + ", Checkout: " + dataFormatada.format(checkout) + " " + duracao() + " Noites";
    }
    
}
