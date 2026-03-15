package Enumeracao_E_Composicao.Exemplo_1;

import java.util.Date;

import Enumeracao_E_Composicao.Exemplo_1.Entities.Pedido;
import Enumeracao_E_Composicao.Exemplo_1.Entities.Enum.OrdemStatus;

public class Exemplo_1 {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(1880, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(p1.toString());
    }
}
