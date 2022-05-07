
import java.util.ArrayList;

public class TestaProdutoEstoque {

    public static void main(String[] args) {
        ProdutoEstoque novoEstoque = new ProdutoEstoque();

        novoEstoque.setNome("Cookies");

        novoEstoque.adicionarEstoque(20);
        novoEstoque.adicionarEstoque(20);

        novoEstoque.retirarEstoque(3);

        System.out.println("Seu estoque de: " + novoEstoque.getNome());
        System.out.println("Possui " + novoEstoque.getEstoque() + " cookies");
    }

}
