package open.close.principle.strategy.model.desconto;

import open.close.principle.enumerator.model.TipoDesconto;
import open.close.principle.strategy.model.Pedido;

public class DescontoAniversario implements Desconto {

    @Override
    public open.close.principle.enumerator.model.TipoDesconto getTipoDesconto() {
        return TipoDesconto.ANIVERSARIO;
    }

}
