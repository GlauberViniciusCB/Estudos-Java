package Orientacao_Objetos.Funcionario;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxaImposto;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public double getTaxaImposto() {
        return taxaImposto;
    }
    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public double salarioLiquido(){ 
        return this.salarioBruto - taxaImposto;
    }

    public void incrementaSalario(double porcentagem ){
        double novoSalario = (this.salarioBruto *porcentagem)/100;
        this.salarioBruto = this.salarioBruto + novoSalario;
    }

    @Override
    public String toString() {
        return "Funcionario:  "+  this.getNome()+ ", R$ " + this.salarioLiquido();
    }

    
}
