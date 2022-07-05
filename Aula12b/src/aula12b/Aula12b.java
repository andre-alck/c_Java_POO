package aula12b;

public class Aula12b {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(100);
        m.setIdade(10);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        r.setPeso(5);
        r.setIdade(15);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();

        p.setPeso(1);
        p.setIdade(5);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(3);
        a.setIdade(50);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        c.locomover();
        k.locomover();
    }

}
