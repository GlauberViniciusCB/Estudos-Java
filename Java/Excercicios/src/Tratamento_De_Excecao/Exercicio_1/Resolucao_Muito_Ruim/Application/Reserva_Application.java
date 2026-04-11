package Tratamento_De_Excecao.Exercicio_1.Resolucao_Muito_Ruim.Application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Tratamento_De_Excecao.Exercicio_1.Resolucao_Muito_Ruim.Model.Entities.Reserva;

public class Reserva_Application {
        public static void main(String[] args) throws ParseException {
            Scanner input = new Scanner(System.in);
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Informe O Número Do Quarto: ");
            int numQuarto = input.nextInt();

            System.out.println("Data Check in: (dd/MM/yyyy)");
            Date checkin = dataFormatada.parse(input.next());

            System.out.println("Data Check Out (dd/MM/yyyy)");
            Date checkout = dataFormatada.parse(input.next());

            if(!checkout.after(checkin)){
                System.out.println("A Data De Check in Deve Ser Anterior A Data De Check Out: ");

            }else{
                Reserva reserva = new Reserva(numQuarto, checkin, checkout);
                System.out.println("\nReserva " + reserva);

                System.out.println();
                System.out.println("Atualizar Datas Da Reserva: ");

                System.out.println("Data Check in: (dd/MM/yyyy)");
                checkin = dataFormatada.parse(input.next());

                System.out.println("Data Check Out (dd/MM/yyyy)");
                checkout = dataFormatada.parse(input.next());

                Date hojeData = new Date();
                if (checkin.before(hojeData) || checkout.before(hojeData)) {
                    System.out.println("As Datas Para Reserva Não Podem Ser Anteriores A Data Atual.");
                }
                else if(!checkout.after(checkin)){
                    System.out.println("A Data De Check in Deve Ser Anterior A Data De Check Out: ");
                }
                else{
                    reserva.atualizarDatas(checkin, checkout);
                    System.out.println("\nReserva " + reserva);
                }

            }

            input.close();
        }
}
