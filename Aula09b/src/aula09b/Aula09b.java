package aula09b;

public class Aula09b {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("ANDRE", 19, "MASCULINO");
        p1.setNome("JULIA");
        p1.setIdade(17);
        p1.setSexo("FEMININO");
        p1.fazerAniver();

        Livro l1 = new Livro("A GAROTA DO LAGO", "CHARLIE DONLEA", 375, 288, false, p1);
        l1.apresentar();
        l1.folhear();
    }

}
