package open.close.principle.strategy.model.desconto;

import open.close.principle.enumerator.model.TipoDesconto;
import open.close.principle.strategy.model.Pedido;

public interface Desconto {

    default double aplicarDesconto(Pedido pedido){
        return pedido.getValorBruto() * getTipoDesconto().getPorcentagemDesconto();
    }

    TipoDesconto getTipoDesconto();

}
