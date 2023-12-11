package quintaAtividade;
public class Mamifero extends Animal {
    private String alimentacao;

    public Mamifero(String nome, float comprimento, int quantidadePernas, String cor, String ambiente, float velocidadeMedia,
            String alimentacao) {
        super(nome, comprimento, quantidadePernas, cor, ambiente, velocidadeMedia);
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    @Override
    public void dados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Quantidade de Pernas: " + getQuantidadePernas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade média: " + getVelocidadeMedia());
        System.out.println("Alimentação: " + alimentacao);
    }
}
