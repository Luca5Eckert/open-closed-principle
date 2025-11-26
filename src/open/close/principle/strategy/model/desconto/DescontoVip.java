package open.close.principle.strategy.model.desconto;

import open.close.principle.enumerator.model.TipoDesconto;
import open.close.principle.strategy.model.Pedido;

public class DescontoVip implements Desconto {

    @Override
    public TipoDesconto getTipoDesconto() {
        return TipoDesconto.VIP;
    }
}
