package aula12b;

public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public void locomover() {
        System.out.println("CORRENDO");
    }
    
    @Override
    public void alimentar() {
        System.out.println("MAMANDO");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("SOM DE MAMIFERO");
    }
}
