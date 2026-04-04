package Heranca_E_Polimorfismo.Exemplo_1.Exemplo_1.Exemplo_1.Entities;

public class ContaParaEmpresas extends Conta{
    private Double limiteEmprestimo;

    public ContaParaEmpresas(){
        super();
    }

    public ContaParaEmpresas(Integer numero, String titular, Double saldo, Double emprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = emprestimo;
    }

    public void emprestimo(double emprestar){
        if(emprestar <= limiteEmprestimo){
            saldo = saldo  + emprestar - 10 ;
        }
    }

    @Override
    public void sacar (Double valorDeSaque){
        super.sacar(valorDeSaque); // Aqui Estou aproveitando o logica da clase original e aplicando outra configuração.
        saldo = saldo - 2.0;
    }

}