
import java.util.Scanner;

public class TestaContaFinal {

    public static void main(String[] args) {
        ContaFinal novaConta = new ContaFinal();

        Scanner input = new Scanner(System.in);
        System.out.print("Caro cliente informe o número da sua conta: ");
        novaConta.numero = input.nextInt();

        novaConta.depositar(475.50);
        novaConta.imprimirExtrato();
        novaConta.sacar(500.00);

        novaConta.imprimirExtrato();

        double saldoDisponivel = novaConta.consultarSaldoDisponivel();

        System.out.println("Seu saldo disponível é de R$" + saldoDisponivel);

    }

}
