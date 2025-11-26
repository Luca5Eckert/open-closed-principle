package open.close.principle.enumerator.model;

public enum TipoDesconto {
    CUPOM(0.90),
    VIP(0.85),
    SAZONAL(0.95),
    ANIVERSARIO(0.80);

    private double porcentagemDesconto;

    TipoDesconto(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

}