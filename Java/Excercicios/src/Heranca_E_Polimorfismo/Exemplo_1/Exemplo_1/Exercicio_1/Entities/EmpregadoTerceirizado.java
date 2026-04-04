package Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exercicio_1.Entities;

public class EmpregadoTerceirizado extends Empregado {
    private Double despesaAdicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

 
    @Override
    public Double pagamento() {
        double totalPagamento =  super.pagamento() + ((despesaAdicional * 110)/100);
        return totalPagamento;
    }

}

    
