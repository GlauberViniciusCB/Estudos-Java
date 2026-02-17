package Data_Hora;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

    

public class Exercicio_1 {
    /* Mostrando Hora e Data -> Momento Agora ) */ 
    public static void main(String[] args) {

        LocalDate diaAtual  = LocalDate.now();
        LocalDateTime horaAtual = LocalDateTime.now();
        Instant diaInstanteGlobal = Instant.now();

        System.out.println("Data: " + diaAtual);
        System.out.println("Hora: " + horaAtual);
        System.out.println("Instante Do Horario Global Londres: " + diaInstanteGlobal);
        
    }
}
