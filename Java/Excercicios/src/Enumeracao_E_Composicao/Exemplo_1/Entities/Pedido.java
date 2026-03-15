package Enumeracao_E_Composicao.Exemplo_1.Entities;

import java.util.Date;

import Enumeracao_E_Composicao.Exemplo_1.Entities.Enum.OrdemStatus;

public class Pedido {
    private Integer id;
    private Date momento;
    private OrdemStatus status;

    public Pedido(Integer id, Date momento, OrdemStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
    }

}