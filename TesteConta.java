package exerciciosaula22;

public class TesteConta {

    public static void main(String[] args) {
        Conta novaConta = new Conta(22323, 500);
        novaConta.setSaldo(600);
        novaConta.depositar(100);
        novaConta.sacar(400);
       
        novaConta.depositar(900);
        novaConta.sacar(499);
        novaConta.sacar(500);
        System.out.println(novaConta.getSaldo());
        try {
            novaConta.depositar(40);

            System.out.println(novaConta.getSaldo());

        } catch (ContaException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
