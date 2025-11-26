package open.close.principle.strategy.model.desconto;

import open.close.principle.enumerator.model.TipoDesconto;

public class DescontoAniversario implements Desconto {

    @Override
    public TipoDesconto getTipoDesconto() {
        return TipoDesconto.ANIVERSARIO;
    }

}
