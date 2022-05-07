
public class ProdutoEstoque {

    private String nome;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;

    }

    public String setNome(String nome) {

        return this.nome = nome;
    }

    public void adicionarEstoque(int estoque) {

        this.estoque += estoque;
        this.verificarEstoqueMinimo();
    }

    public void retirarEstoque(int estoque) {

        this.estoque -= estoque;
        this.verificarEstoqueMinimo();

    }

    private void verificarEstoqueMinimo() {
        if (this.getEstoque() < 5) {
            System.out.println("Seu estoque está no limite:" + this.getEstoque() + this.getNome()+ " compre mais itens");

        } 

    }

    
}
