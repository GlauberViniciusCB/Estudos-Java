package Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercicio_7 {
    public static void main(String[] args) {
        
        /*Operações Com Data e Hora*/ 

        LocalDate dia1 = LocalDate.parse("2026-02-28");
        LocalDateTime diaTime = LocalDateTime.parse("2023-11-27T09:20:00");
        LocalDateTime diaTime2 = LocalDateTime.parse("2025-02-17T09:20:00");
        Instant instante = Instant.parse("2026-02-28T22:20:00Z");
        

        LocalDate semanaAnterior = dia1.minusDays(7);
        LocalDate proximaSemana = dia1.plusDays(7);
        
        Instant insProximaSemana = instante.plus(7,ChronoUnit.DAYS);
        Instant instAnteriorSemana = instante.minus(7,ChronoUnit.DAYS);

        System.out.println("Semana Anterior: "+ semanaAnterior);
        System.out.println("Próxima Semana: " + proximaSemana);

        System.out.println("Instanciando Objetos Com Instant: ");
        System.out.println("Próxima Semana: " + insProximaSemana);
        System.out.println("Semana Anterior: " + instAnteriorSemana);


        /*Calculando Duração */ 

        Duration tempo1  = Duration.between(diaTime,diaTime2);
        System.out.println("Duração " + tempo1.toHours()) ;

    }
}
