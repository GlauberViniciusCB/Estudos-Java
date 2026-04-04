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

    
    @Override
    public Double pagamento() {
        double totalPagamento = (horas * valorPorHora) + ((despesaAdicional * 110)/100);
        return totalPagamento;
    }
}
