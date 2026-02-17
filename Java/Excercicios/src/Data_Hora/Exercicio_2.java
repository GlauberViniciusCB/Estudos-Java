package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercicio_2 {
    /*Transformando Texto ISO 8601 E Gerar Uma Data Hora A Partir Dele.*/ 
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.parse("2022-07-20");
        LocalDateTime dataHoraAtualGlobal = LocalDateTime.parse("2026-02-16T01:30:35")  ;
        Instant instanteDataEHoraGlobal =  Instant.parse("2026-02-16T01:30:35Z");
        Instant instanteDataEHoraGlobalAtual =  Instant.parse("2026-02-17T11:07:35-03:00");

        System.out.println("Data: "+ dataAtual);
        System.out.println("Data E Hora Global: " + dataHoraAtualGlobal);
        System.out.println("Data E Hora Instante Global: " +  instanteDataEHoraGlobal);
        System.out.println("Mostre O Horario Equivalente A Hora Zulu Em Londres: " + instanteDataEHoraGlobalAtual);

        

    }
}
