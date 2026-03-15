package Enumeracao_E_Composicao.RedeSocial.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Enumeracao_E_Composicao.RedeSocial.Entities.Cometario;
import Enumeracao_E_Composicao.RedeSocial.Entities.Post;

public class ApplicationRedeSocial {
    public static void main(String[] args) throws ParseException {
     
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Cometario comentario1 = new Cometario("Have a nice trip!");    
        Cometario cometario2 = new Cometario("Wow thas's awesome!");

        Post p1 =  new Post(formato.parse("21/06/2018 13:05:2018"), "Traveling to New Zealand", "I' m going to visit this woderful country!", 12);
        p1.addComentario(comentario1);
        p1.addComentario(cometario2);

        System.out.println(p1);
    }
}   
