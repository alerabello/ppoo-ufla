public class ContaBancaria {
    private double saldo;
    private double limite;
    private int numero;
    private String nomeCliente;

    public ContaBancaria(int numero, String nomeCliente, double limite) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
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
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }
}