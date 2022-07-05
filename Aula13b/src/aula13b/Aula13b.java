package aula13b;

public class Aula13b {

    public static void main(String[] args) {
        // Animal a = new Animal();
        Mamifero m = new Mamifero();
        m.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        
        c.reagir("TOMA COMIDA");
        c.reagir("FEIO");
        c.reagir(true);
        c.reagir(false);
        c.reagir(1, 1);
        c.reagir(99, 99);
        c.reagir(1, 99);
        c.reagir(99, 1);
        c.reagir(1, 0);
        c.reagir(13, 0);
        c.reagir(19, 0);
    }
    
}
