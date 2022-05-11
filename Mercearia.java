package exerciciosaula20;

public class Mercearia {

    private int qtdLaranjasVendidas;
    private double precoLaranjaVarejo;

    public Mercearia(int qtdLaranjasVendidas, double precoLaranjaVarejo) {
        this.qtdLaranjasVendidas = qtdLaranjasVendidas;
        this.precoLaranjaVarejo = precoLaranjaVarejo;
    }

    public double getReceitaBruta() {
        return qtdLaranjasVendidas * precoLaranjaVarejo;

    }

    public double getQtdLaranjasVenderMetaReceita(int valorMeta) {
        return valorMeta / precoLaranjaVarejo;

    }

    public int getQtdLaranjasVendidas() {
        return qtdLaranjasVendidas;
    }

    public void setQtdLaranjasVendidas(int qtdLaranjasVendidas) {
        this.qtdLaranjasVendidas = qtdLaranjasVendidas;
    }

    public double getPrecoLaranjaVarejo() {
        return precoLaranjaVarejo;
    }

    public void setPrecoLaranjaVarejo(double precoLaranjaVarejo) {
        this.precoLaranjaVarejo = precoLaranjaVarejo;
    }

    public void imprimir() {
        System.out.println("----------------------");
        System.out.println("Quantidade de laranjas: " + this.getQtdLaranjasVendidas());
        System.out.println("Preço das laranjas: R$ " + this.getPrecoLaranjaVarejo());
        System.out.println("Receita obtida: R$ " + this.getReceitaBruta());
    }
}
