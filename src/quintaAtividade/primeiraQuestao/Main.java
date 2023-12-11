package quintaAtividade;

public class Main {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("Tilapia", 40, 0, "Azul", "Água Doce", 0,
                """
                        A tilápia é um peixe de água doce que podem medir entre 40 cm
                        e 90 cm e pesar até 12 kg, dependendo da espécie
                        """);
        Mamifero mamifero1 = new Mamifero("Cachorro", 110, 4, "Variadas", "Casas", 100, "Raçao");

        peixe1.dados();

        mamifero1.dados();
    }
}
