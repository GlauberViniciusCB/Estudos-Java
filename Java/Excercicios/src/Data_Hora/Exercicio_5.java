package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercicio_5 {
    public static void main(String[] args) {
     
        /*Convertendo Data e Hora Para Texto De Forma Customizada. */
        
        LocalDate dia = LocalDate.parse("2026-02-27");
        LocalDateTime diaTime = LocalDateTime.parse("2026-02-27T09:20:00");
        Instant instante = Instant.parse("2026-02-27T09:20:00Z");
    
        DateTimeFormatter formatacao1  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data: " + dia.format(formatacao1));


        DateTimeFormatter formatacao2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data e Hora: " + diaTime.format(formatacao2));


        DateTimeFormatter formatacao3  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Data E Hora:" + formatacao3.format(instante));
        
    }
}
