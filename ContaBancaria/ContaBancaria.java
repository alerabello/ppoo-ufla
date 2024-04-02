public class ContaBancaria {
    private double saldo;
    private double limite;


    public ContaBancaria(double limite) {
        this.saldo = 0.0;
        this.limite = limite;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}