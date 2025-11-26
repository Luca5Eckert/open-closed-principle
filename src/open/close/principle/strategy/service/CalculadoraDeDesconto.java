package open.close.principle.strategy.service;

import open.close.principle.strategy.model.desconto.Desconto;
import open.close.principle.strategy.model.Pedido;

public class CalculadoraDeDesconto {

    public double aplicarDesconto(Pedido pedido){
        Desconto desconto = DescontoProvider.toInstance(pedido.getTipoDesconto());

        return desconto.aplicarDesconto(pedido);
    }

}
