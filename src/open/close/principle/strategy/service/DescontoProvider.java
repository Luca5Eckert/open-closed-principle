package open.close.principle.strategy.service;

import open.close.principle.strategy.model.desconto.*;

import java.util.Map;

public class DescontoProvider {

    public final static Map<TipoDesconto, Desconto> descontos = Map.of(
            TipoDesconto.CUPOM, new DescontoCupom(),
            TipoDesconto.ANIVERSARIO, new DescontoAniversario(),
            TipoDesconto.SAZONAL, new DescontoSazonal(),
            TipoDesconto.VIP, new DescontoVip()
    );

    public static Desconto toInstance(TipoDesconto tipoDesconto){
        return descontos.get(tipoDesconto);
    }

}
