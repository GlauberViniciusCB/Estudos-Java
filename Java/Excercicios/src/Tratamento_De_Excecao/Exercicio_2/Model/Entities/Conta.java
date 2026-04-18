package Tratamento_De_Excecao.Exercicio_2.Model.Entities;

import Tratamento_De_Excecao.Exercicio_2.Model.Exception.ExcetionConta;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteConta;

    public Conta(){

    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteConta = limiteConta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }


    public Double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(Double limiteConta) {
        this.limiteConta = limiteConta;
    }


    public void Depositar(Double valorDeposito){
        saldo = saldo + valorDeposito; 
    }

    public void sacar(Double valorSaque ){
        validacao(valorSaque);
        saldo = saldo - valorSaque;
    }

    public void validacao(Double quantia ){
        if(quantia > getLimiteConta()){
            throw new ExcetionConta("Erro de Saque: A Quantia Excede O Limite De Saque.");
        } 
        if (quantia >  getSaldo()){
            throw new ExcetionConta("Erro de Saque: Saldo Insuficiente. ");
        }
    }


    @Override
    public String toString() {
        return "\nNumero: " + numero + ", Titular: " + titular + ", Saldo: " + saldo + ", Limite Da Conta: " + limiteConta
                + " ";
    }
}
