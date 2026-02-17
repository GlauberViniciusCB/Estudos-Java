package Data_Hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio_3 {
    /*Criando Um Formato Customizado E Convertendo Documentação: https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html */ 
    public static void main(String[] args) {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatoPersonalizado = LocalDate.parse("17/02/2026",formatacao);

        System.out.println("Formato Personalizado: " + dataFormatoPersonalizado);

    }
}
