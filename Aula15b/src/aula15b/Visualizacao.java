package aula15b;

public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public void avaliar() {
        espectador.apresentar();
        filme.apresentar();
        System.out.println("5 ESTRELAS");
    }

    public void avaliar(int estrelas) {
        if(estrelas < 0) {
            estrelas = 0;
        } else if (estrelas > 5) {
            estrelas = 5;
        }
        
        espectador.apresentar();
        filme.apresentar();
        System.out.println(estrelas + " ESTRELAS");
    }

    public void avaliar(float porc) {
        espectador.apresentar();
        filme.apresentar();
        int estrelas;
        if (porc < 20) {
            estrelas = 1;
        } else if (porc < 40) {
            estrelas = 2;
        } else if (porc < 60) {
            estrelas = 3;
        } else if (porc < 80) {
            estrelas = 4;
        } else {
            estrelas = 5;
        }
        System.out.println(estrelas + " ESTRELAS");
    }
}
