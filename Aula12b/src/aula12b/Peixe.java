package aula12b;

public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("NADANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("TOMANDO AGUA");
    }

    @Override
    public void emitirSom() {
        System.out.println("SONS DE PEIXE");
    }

    public void soltarBolha() {
        System.out.println("SOLTOU UMA BOLHA.");
    }

}
