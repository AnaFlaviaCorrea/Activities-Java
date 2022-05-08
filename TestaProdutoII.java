package exerciciosaula19;

public class TestaProdutoII {

    public static void main(String[] args) {

        Produto novo = new Produto();

        novo.valoresIniciais("Avelate", "Lindt", 20);
        novo.imprimir();
        novo.aumentaPreco(20);

        Produto novoII = new Produto();

        novoII.valoresIniciais("Barrinha", 10);
        novoII.imprimir();
        novoII.aumentaPreco();

    }

}
