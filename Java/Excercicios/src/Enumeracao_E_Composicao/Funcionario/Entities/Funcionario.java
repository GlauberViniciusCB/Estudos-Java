package Enumeracao_E_Composicao.Funcionario.Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Enumeracao_E_Composicao.Funcionario.Entities.Enum.SenioridadeProfissional;

public class Funcionario {
    private String nome;
    private SenioridadeProfissional SenioridadeProfissional;
    private Double baseSalarial;
    
    private Departamento departamento;
    private List<Contrato> contratos = new ArrayList<>();


    public Funcionario() {
    }


    public Funcionario(String nome,
            Enumeracao_E_Composicao.Funcionario.Entities.Enum.SenioridadeProfissional senioridadeProfissional,
            Double baseSalarial, Departamento departamento) {
        this.nome = nome;
        SenioridadeProfissional = senioridadeProfissional;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public SenioridadeProfissional getSenioridadeProfissional() {
        return SenioridadeProfissional;
    }


    public void setSenioridadeProfissional(SenioridadeProfissional senioridadeProfissional) {
        SenioridadeProfissional = senioridadeProfissional;
    }


    public Double getBaseSalarial() {
        return baseSalarial;
    }


    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }


    public Departamento getDepartamento() {
        return departamento;
    }


    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    public List<Contrato> getContratos() {
        return contratos;
    }


    public void adicionarContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public void removerContrato(Contrato contrato){
        contratos.remove(contrato);
    }

    public double renda(int ano,int mes){
        
        double somasalario = baseSalarial;
        Calendar cal = Calendar.getInstance();

        for (Contrato contrato : contratos) {

            cal.setTime(contrato.getData());
            int anoContrato = cal.get(Calendar.YEAR);
            int mesContrato = 1 + cal.get(Calendar.MONTH);

            if (ano == anoContrato && mes == mesContrato ) {
                somasalario = somasalario + contrato.valorFinal();
            }
        }
        return somasalario;
    }
    
}
