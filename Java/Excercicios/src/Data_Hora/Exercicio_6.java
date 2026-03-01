package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exercicio_6 {
    public static void main(String[] args) {
        /*Convertendo Data - Hora Global Para Local*/ 

        /* Alguns Nome Que Podem Ser Usados Para Expecificar Um Fuso Horário */ 
        for (String IdPaises : ZoneId.getAvailableZoneIds()) {
            System.out.println(IdPaises);
        }

        LocalDate dia = LocalDate.parse("2026-02-27");
        LocalDateTime diaTime = LocalDateTime.parse("2026-02-27T21:20:00");
        Instant instante = Instant.parse("2026-02-28T22:20:00Z");

        LocalDate formataResult = LocalDate.ofInstant(instante, ZoneId.systemDefault());
        LocalDate formataResult2 = LocalDate.ofInstant(instante, ZoneId.of("Portugal"));
    
        /*Convertendo Um Instant Para Uma Data Local Considerando O Horário Do Sistema Local*/ 
        System.out.println("Data Local: " + formataResult);
        System.out.println("Data Local: " + formataResult2);

        


    }
}
