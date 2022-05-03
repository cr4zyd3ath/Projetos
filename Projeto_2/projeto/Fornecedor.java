package projeto;

public class Fornecedor extends Pessoa{

    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
        this.valorCredito = 0.0;
        this.valorDivida = 0.0;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(double valorCredito, double valorDivida) {
        this.valorCredito = this.valorCredito - this.valorDivida;
        return this.valorCredito;
    }

}