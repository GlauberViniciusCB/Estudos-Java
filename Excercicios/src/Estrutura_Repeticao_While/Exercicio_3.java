package Estrutura_Repeticao_While;

import java.util.Scanner;

/*   
    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.

*/ 
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha = 0,contGasolina=0,contAlcool=0,contDiesel=0; 
        while (escolha != 4) {
            System.out.println("\nQual Tipo De Combutivel Você Prefere:\n1 - Àlcool\n2 - Gasolina\n3 - Diesel\n4 - Fim");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    contAlcool = contAlcool + 1;
                    break;
                case 2:
                    contGasolina = contGasolina + 1;
                    break;
                case 3: 
                    contDiesel = contDiesel +  1;
                    break;
                case 4:
                    System.out.println("\nMuito Obrigado");
                    break;
            }
        }
        System.out.println("\nÀlcool: " + contAlcool +"\nGasolina: " + contGasolina + "\nDiesel: " + contDiesel);
    }
}
