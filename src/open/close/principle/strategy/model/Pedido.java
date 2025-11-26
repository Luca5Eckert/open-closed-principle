package open.close.principle.strategy.model;

import open.close.principle.strategy.model.desconto.TipoDesconto;

public class Pedido {

    private String id;
    private double valorBruto;
    private int quantidadeItens;
    private boolean isPago;
    private String emailCliente;
    private TipoDesconto tipoDesconto;

    public Pedido(String id, double valorBruto, int quantidadeItens, String
            emailCliente, TipoDesconto tipoDesconto) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.quantidadeItens = quantidadeItens;
        this.isPago = false;
        this.emailCliente = emailCliente;
        this.tipoDesconto = tipoDesconto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public boolean isPago() {
        return isPago;
    }

    public void setPago(boolean pago) {
        isPago = pago;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public TipoDesconto getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(TipoDesconto tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }
}
