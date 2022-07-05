package aula02b;
public class Aula02b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 1;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Crayola";
        c2.cor = "Azul";
        c2.ponta = 0.5f;
        c2.carga = 1;
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}