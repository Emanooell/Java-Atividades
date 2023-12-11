public class Main {
    public static void main(String[] args) {
        Ingresso ingressoPadrao = new IngressoNormal(50.0);
        ingressoPadrao.imprimeNovoValor();

        IngressoVip ingressoVip = new IngressoVip(70.0, 20.0);
        double valorAdicionalIngressoVip = ingressoVip.obterNovoValorAdicional();
        System.out.println("Valor Adicional do Ingresso VIP: R$" + valorAdicionalIngressoVip);

        CamaroteOfside camaroteInferior = new CamaroteOfside(80.0, 30.0);
        camaroteInferior.imprimeNovoValor();
        
        // camaroteInferior.imprimeNovaLocalizacao(); // Remova ou comente essa linha

        // Ajustando a chamada do método específico de CamaroteOfside
        double valorDoIngressoCamaroteInferior = camaroteInferior.obterValorDoIngresso();
        System.out.println("Valor do Ingresso no Camarote Inferior: R$" + valorDoIngressoCamaroteInferior);

        // CamaroteInside camaroteSuperior = new CamaroteInside(100.0, 50.0, "Camarote Superior");
        // double valorTotalCamaroteSuperior = camaroteSuperior.obterValorDoIngresso();
        // System.out.println("Valor Total do Camarote Superior: R$" + valorTotalCamaroteSuperior);
    }
}

