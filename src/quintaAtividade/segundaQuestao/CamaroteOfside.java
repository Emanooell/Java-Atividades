public class CamaroteOfside extends IngressoVip {
    public CamaroteOfside(double novoValor, double novoValorAdicional) {
        super(novoValor, novoValorAdicional);
    }

    // Adicionando o método imprimeNovaLocalizacao()
    public void imprimeNovaLocalizacao() {
        System.out.println("Método imprimeNovaLocalizacao() não faz sentido para CamaroteOfside");
    }

    public double obterValorDoIngresso() {
        return obterNovoValor() + obterNovoValorAdicional();
    }
}
