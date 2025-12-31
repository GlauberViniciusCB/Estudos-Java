package Listas.entities;

import java.util.List;


public class Empregado {
    private Integer id;
    private String nome;  
    private Double salario;

    public Empregado() {

    }

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getSalario() {
        return salario;
    }

    /*Parei aqui na contrustação da função validaID*/ 
    public static boolean validaID(List<Empregado> listaEmpregados, Integer idDoEmpregado ){
        Empregado emp = listaEmpregados.stream().filter(x-> x.getId() == idDoEmpregado).findFirst().orElse(null);
        return emp !=null;
    }
    


    public void aumento(double salario, double porcetagemAum){
       this.salario += (this.salario * porcetagemAum)/100 ; 
    }

    @Override
    public String toString() {
        return getId() + ", "+ getNome() + ", "+ getSalario();
        
    }
    

}
