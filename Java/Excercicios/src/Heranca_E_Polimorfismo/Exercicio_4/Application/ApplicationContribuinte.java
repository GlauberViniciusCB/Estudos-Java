package Heranca_E_Polimorfismo.Exercicio_4.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Heranca_E_Polimorfismo.Exercicio_4.Entities.Contribuinte;
import Heranca_E_Polimorfismo.Exercicio_4.Entities.PessoaFisica;
import Heranca_E_Polimorfismo.Exercicio_4.Entities.PessoaJuridica;

public class ApplicationContribuinte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Contribuinte> listaContribuintes = new ArrayList<>();


        System.out.println("Informe O Número Maximo De Contribuintes: ");
        int quantContribuintes = input.nextInt();

        for (int i = 0; i < quantContribuintes; i++) {
            
            System.out.println("Informe O Tipo Contribuinte: Pessoa Fisíca (F) Ou Jurídica (J): ");
            char escolha  = input.next().charAt(0);
        

            input.nextLine();

            System.out.print("Nome:");
            String nomeContribuinte = input.next();

            System.out.println("Renda Anual: ");
            double rendaAnual = input.nextDouble();

            if(escolha == 'F' || escolha == 'f'){
                
                System.out.println("Gastos Com Saúde: ");
                double gastoSaude = input.nextDouble();
                
                Contribuinte contribuinte = new PessoaFisica(nomeContribuinte, rendaAnual, gastoSaude); 
                listaContribuintes.add(contribuinte);
            }

            if (escolha == 'J' || escolha == 'j') {
                
                System.out.println("Número De Funcionários: ");
                int numFuncionarios = input.nextInt();
                
                Contribuinte contribuinte = new PessoaJuridica(nomeContribuinte, rendaAnual, numFuncionarios);
                listaContribuintes.add(contribuinte);
            }

        }

        double totalDeImpostos = 0.0;

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        
        for (Contribuinte contribuinte : listaContribuintes) {
            double imposto = contribuinte.calculoDeImpostos();
            System.out.println(String.format("%s: R$ %.2f", contribuinte.getNome(), imposto));
            
            totalDeImpostos += imposto;
        }
        
        System.out.println();
        System.out.println("TOTAL DE TAXAS: R$ " + String.format("%.2f", totalDeImpostos));
        
        input.close();
        
    }
}
