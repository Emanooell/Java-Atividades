package quintaAtividade;
public class Peixe extends Animal {
    private String caracteristicas = "";

    public Peixe(String nome, float comprimento, int quantidadePernas, String cor, String ambiente, float velocidadeMedia,
            String caracteristicas) {
        super(nome, comprimento, quantidadePernas, cor, ambiente, velocidadeMedia);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void dados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Quantidade de Pernas: " + getQuantidadePernas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade média: " + getVelocidadeMedia());
        System.out.println("Características do peixe: " + getCaracteristicas());
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
