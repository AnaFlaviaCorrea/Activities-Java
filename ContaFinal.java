
public class ContaFinal {

    public int numero;
    public double saldo;
    public double limite = 100;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da sua conta :" + numero + " Seu saldo é R$: "
                + (this.saldo + limite));
    }

    public double consultarSaldoDisponivel() {

        return (this.saldo + this.limite);

    }
}
