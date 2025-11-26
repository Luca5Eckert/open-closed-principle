package open.close.principle.strategy.service;

import open.close.principle.strategy.model.desconto.*;

public class DescontoProvider {

    private final static Desconto DESCONTO_VIP = new DescontoVip();
    private final static Desconto DESCONTO_CUPOM = new DescontoCupom();
    private final static Desconto DESCONTO_SAZONAL = new DescontoSazonal();
    private final static Desconto DESCONTO_ANIVERSARIO = new DescontoAniversario();

    public static Desconto toInstance(TipoDesconto tipoDesconto){
        return switch (tipoDesconto){
            case CUPOM -> DESCONTO_CUPOM;
            case VIP -> DESCONTO_VIP;
            case SAZONAL -> DESCONTO_SAZONAL;
            case ANIVERSARIO -> DESCONTO_ANIVERSARIO;
        };
    }

}
