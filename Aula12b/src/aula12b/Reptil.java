package aula12b;

public class Reptil extends Animal {
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("RASTEJANDO");
    }
    
    @Override
    public void alimentar() {
        System.out.println("COMENDO VEGETAIS");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("SOM DE REPTIL");
    }
}
