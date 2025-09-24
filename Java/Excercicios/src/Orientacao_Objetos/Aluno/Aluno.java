package Orientacao_Objetos.Aluno;

public class Aluno {
    private String nome;
    private double nota_1;
    private double nota_2;
    private double nota_3;
    private String status;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota_1() {
        return nota_1;
    }
    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }
    public double getNota_2() {
        return nota_2;
    }
    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }
    public double getNota_3() {
        return nota_3;
    }
    public void setNota_3(double nota_3) {
        this.nota_3 = nota_3;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public double calculaMedia(double nota1, double nota2,double nota3){
        double media; 
        media =  nota1 + nota2 + nota3;
        return media;
    }

    public String determinaAprovacao(double mediaFinal){
        if (mediaFinal >= 60 ) {
           this.setStatus("Nota Final = " +  mediaFinal + "\nAprovado");
           return this.getStatus(); 
        }
        else{
            double faltouParaAtingirMedia = 0;
            faltouParaAtingirMedia = 60 - mediaFinal; 
            
            this.setStatus("Nota Final= "+mediaFinal +" Reprovado" + "\nNota Ausente = " + faltouParaAtingirMedia);
            return this.getStatus();
        }
    }
    
}
 
