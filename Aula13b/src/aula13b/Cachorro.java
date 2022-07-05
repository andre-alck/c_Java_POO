package aula13b;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au!");
    }

    public void reagir(String frase) {
        if (frase.equals("TOMA COMIDA") || frase.equals("OLA") || frase.equals("CHEGUEI")) {
            System.out.println("ABANAR E LATIR");
        } else {
            System.out.println("ROSNAR");
        }
    }

    public void reagir(int hora, int minuto) {
        if (hora < 12) {
            System.out.println("ABANAR");
        } else if (hora >= 18) {
            System.out.println("IGNORAR");
        } else {
            System.out.println("ABANAR E LATIR");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("ABANAR");
        } else {
            System.out.println("ROSNAR E LATIR");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("ABANAR");
            } else {
                System.out.println("LATIR");
            }
        } else {
            if (peso < 10) {
                System.out.println("ROSNAR");
            } else {
                System.out.println("IGNORAR");
            }
        }
    }
}
