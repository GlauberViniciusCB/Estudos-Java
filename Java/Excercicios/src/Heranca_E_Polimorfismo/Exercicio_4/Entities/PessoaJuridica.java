package Heranca_E_Polimorfismo.Exercicio_4.Entities;

public class PessoaJuridica extends Contribuinte{
    private Integer numeroDeFuncionarios;

    
    public PessoaJuridica(){
        super();
    }

    
    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
    
    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }


    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }


    @Override
    public Double calculoDeImpostos() {
       double totalImposto = 0.0;
        if (numeroDeFuncionarios > 10) {
            totalImposto = getRendaAnual() * 0.14;
        }
        else{
            totalImposto  = getRendaAnual() * 0.16;
        }

        return totalImposto;
    }
}
