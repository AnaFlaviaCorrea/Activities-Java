package exerciciosaula19;

public class Produto {

    private String nome;
    private String marca;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void valoresIniciais(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void valoresIniciais(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public void aumentaPreco(double porcentagem) {
        if (porcentagem > 0) {
            porcentagem = 1 + (porcentagem / 100);
            this.preco = preco * porcentagem;
            System.out.println("Novo preço: R$ " + this.preco);
        } else {
            System.out.println("O aumento deve ser maior que zero");
        }
    }

    public void aumentaPreco() {
        aumentaPreco(8);

    }

    public void imprimir() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Preço: " + this.preco);

    }
}
