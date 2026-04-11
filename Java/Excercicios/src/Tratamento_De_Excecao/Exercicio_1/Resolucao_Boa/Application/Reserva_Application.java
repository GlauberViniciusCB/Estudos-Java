package Tratamento_De_Excecao.Exercicio_1.Resolucao_Boa.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Tratamento_De_Excecao.Exercicio_1.Resolucao_Boa.Model.Entities.Reserva;
import Tratamento_De_Excecao.Exercicio_1.Resolucao_Boa.Model.Exceptions.DomainException;

public class Reserva_Application {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.println("Informe O Número Do Quarto: ");
            int numQuarto = input.nextInt();

            System.out.println("Data Check in: (dd/MM/yyyy)");
            Date checkin = dataFormatada.parse(input.next());

            System.out.println("Data Check Out (dd/MM/yyyy)");
            Date checkout = dataFormatada.parse(input.next());

            Reserva reserva = new Reserva(numQuarto, checkin, checkout);
            System.out.println("\nReserva " + reserva);

            System.out.println();
            System.out.println("Atualizar Datas Da Reserva: ");

            System.out.println("Data Check in: (dd/MM/yyyy)");
            checkin = dataFormatada.parse(input.next());

            System.out.println("Data Check Out (dd/MM/yyyy)");
            checkout = dataFormatada.parse(input.next());
            
            reserva.atualizarDatas(checkin, checkout);
            System.out.println("\nReserva " + reserva);
        }
        catch(ParseException e){
            System.out.println("Formato De Data Inválido.");
        }
        catch(DomainException e){
            System.out.println("Erro Na Reserva: "  + e.getMessage() );
        }catch(RuntimeException e){
            System.out.println("Erro Inesperado ");
        }
        
        input.close();
    
    }
}
