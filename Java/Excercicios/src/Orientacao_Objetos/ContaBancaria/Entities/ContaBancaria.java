package Orientacao_Objetos.ContaBancaria.Entities;

public class ContaBancaria {
    private int numConta;
    private String titular;
    private double saldo;


    public ContaBancaria(int numConta, String titularConta){
        this.numConta = numConta;
        this.titular = titularConta;
    }

    public ContaBancaria(int numDaconta, String titularDaConta, double depositoInicial){
        this.numConta = numDaconta;
        this.titular = titularDaConta;
        depositar(depositoInicial);
    }

    public int getNumConta() {
        return numConta;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito ){
        this.saldo = this.saldo + deposito;
    }

    public void saque (double sacar){
        this.saldo = this.saldo - (sacar + 5.0);
    }

    public String toString(){
        return "Número Da Conta: " + getNumConta() + " Titular Da Conta: " + getTitular() +" Saldo: R$" + String.format("%.2f",  + getSaldo());
    }
    
}
