

public class Ingresso {
    private double novoValor;

    public Ingresso(double novoValor) {
        this.novoValor = novoValor;
    }

    public void imprimeNovoValor() {
        System.out.println("Novo Valor do Ingresso: R$" + novoValor);
    }

    public double obterNovoValor() {
        return novoValor;
    }

    public void definirNovoValor(double novoValor) {
        this.novoValor = novoValor;
    }
}
