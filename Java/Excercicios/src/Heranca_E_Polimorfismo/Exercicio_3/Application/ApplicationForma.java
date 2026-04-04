package Heranca_E_Polimorfismo.Exercicio_3.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Heranca_E_Polimorfismo.Exercicio_3.Entities.Circulo;
import Heranca_E_Polimorfismo.Exercicio_3.Entities.Forma;
import Heranca_E_Polimorfismo.Exercicio_3.Entities.Retangulo;
import Heranca_E_Polimorfismo.Exercicio_3.Entities.Enum.Cor;

public class ApplicationForma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Forma>  listaFormas =  new ArrayList<>();
        
        System.out.println("Informe A Quantidade De Formas: ");
        int quantFormas = input.nextInt();

        for (int i = 0; i < quantFormas; i++) {
            
            System.out.println("Digite C Para Cadastar Circulo e R Para Retângulo: Da Figura: " + (i+1));
            char escolha = input.next().charAt(0);

            System.out.println("Cor: (AZUL,PRETO,VERMELHO)");
            Cor cor = Cor.valueOf(input.next());
            

            if (escolha == 'c' || escolha == 'C') {
                
                System.out.println("Informe O Raio: ");
                double raio = input.nextDouble();
                
                
                Forma  forma = new Circulo(cor, raio);
                listaFormas.add(forma);
                
            }
            else if(escolha == 'r' || escolha == 'R'){
                
                System.out.println("Largura: ");
                double largura = input.nextDouble();

                System.out.println("Altura: ");
                double altura = input.nextDouble();

                Forma forma = new Retangulo(cor, largura, altura);
                listaFormas.add(forma);

            }

        }
         System.out.println("Areas Das Formas: ");
            for (Forma forma : listaFormas) {
                System.out.println(String.format("%.2f", forma.area()));
            }
            input.close();
    }
}
