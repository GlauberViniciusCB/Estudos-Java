package Heranca_E_Polimorfismo.Exercicio_4.Entities;

public class PessoaFisica extends Contribuinte {
    private Double gastoComSaude;

    
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }


    @Override
    public Double calculoDeImpostos() {
        double totalImposto = 0.0;
        if (getRendaAnual() < 20.000 ) {
            totalImposto  =  getRendaAnual() * 0.15 ;
        }
        else if(getRendaAnual() > 20.000 ){
            totalImposto = getRendaAnual() * 0.25;
            
        }

        if(gastoComSaude > 0.0){
            totalImposto =  totalImposto - (gastoComSaude * 0.50);
        }


        return totalImposto;
    }

    

}
