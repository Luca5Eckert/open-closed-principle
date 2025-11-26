package open.close.principle.enumerator.service;

import open.close.principle.enumerator.model.Pedido;

public class CalculadoraDeDesconto {

    public double aplicarDesconto(Pedido pedido){
        return pedido.aplicarDesconto();
    }

}
