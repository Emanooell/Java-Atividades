

public class IngressoVip extends Ingresso {
    private double novoValorAdicional;

    public IngressoVip(double novoValor, double novoValorAdicional) {
        super(novoValor);
        this.novoValorAdicional = novoValorAdicional;
    }

    public double obterNovoValorAdicional() {
        return obterNovoValor() + novoValorAdicional;
    }
}

