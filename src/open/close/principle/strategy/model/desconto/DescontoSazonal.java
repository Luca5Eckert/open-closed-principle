package open.close.principle.strategy.model.desconto;

import open.close.principle.enumerator.model.TipoDesconto;

public class DescontoSazonal implements Desconto {

    @Override
    public open.close.principle.enumerator.model.TipoDesconto getTipoDesconto() {
        return TipoDesconto.SAZONAL;
    }
}
