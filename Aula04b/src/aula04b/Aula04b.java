package aula04b;

public class Aula04b {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 1.2f, "AZUL");
        Caneta c2 = new Caneta("CRAYOLA", 1.3f, "VERMELHA");
        
        c1.status();
        System.out.println("-");
        c2.status();
    }
    
}