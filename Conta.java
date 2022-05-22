package exerciciosaula22;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public void depositar(double valor) throws ContaException {
        if (valor >= 1000) {
            throw new ContaException("Não é possível realizar depósito, valor de: R$" + valor + "acima do aceito pelo sistema");

        } else {
            this.saldo += valor;

        }
    }

    public void sacar(double valor) throws ContaException {

        if (valor >= 500 || saldo < 0) {
            throw new ContaException("Você não poderá sacar: R$" + valor + "acima de R$500,00 ou saldo abaixo de zero.");

        } else {
            this.saldo -= valor;
            System.out.println("Seu saque no valor de: R$" + valor + " foi liberado");

        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
