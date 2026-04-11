package Tratamento_De_Excecao.Exercicio_1.Resolucao_Ruim.Model.Entities;

import java.util.Date;
import java.text.SimpleDateFormat;
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

    public String atualizarDatas(Date checkin, Date checkout){
        Date agora = new Date();
        if (checkin.before(agora) || checkout.before(agora)) {
            return "Reserva Deve Ser Para Data Futuras Ao Dia Atual";
        }
        if (!checkout.after(checkin)) {
            return "Check Out Deve Ser Em Uma Data Posterior A Data De Check In";
        }

        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Quarto: " + numeroQuarto + ", Checkin: " + dataFormatada.format(checkin) + ", Checkout: " + dataFormatada.format(checkout) + " " + duracao() + " Noites";
    }
}
