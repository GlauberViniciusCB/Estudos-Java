package Enumeracao_E_Composicao.RedeSocial.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private String titulo; 
    private String conteudo;
    private Integer curtidas;
    private List<Cometario> cometarios = new ArrayList<>();

    public Post() {
    
    }

    public Post(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Cometario> getCometarios() {
        return cometarios;
    }

    public void addComentario(Cometario cometario){
        cometarios.add(cometario);
    }

    public void removeCometario(Cometario cometario){
        cometarios.remove(cometario);
    }

    @Override
    public String toString() {
        StringBuilder  sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(curtidas + "\n");
        sb.append("Curtidas - ");
        sb.append(formato.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for (Cometario cometario : cometarios) {
                sb.append(cometario.getTexto()+ "\n");
        }

        return sb.toString();
    }

    

}
