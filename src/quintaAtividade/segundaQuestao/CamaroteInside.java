public class CamaroteInside extends IngressoVip {
    private String novaLocalizacao;

    public CamaroteInside(double novoValor, double valorAdicional, String novaLocalizacao) {
        super(novoValor, valorAdicional);
        this.novaLocalizacao = novaLocalizacao;
    }

    public String getNovaLocalizacao() {
        return novaLocalizacao;
    }

    public void imprimeNovaLocalizacao() {
        System.out.println("Nova Localização do Ingresso: " + novaLocalizacao);
    }
}
