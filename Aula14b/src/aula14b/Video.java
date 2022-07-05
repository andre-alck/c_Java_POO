package aula14b;

public class Video implements AcoesVideo {

    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (this.isReproduzindo()) {
            System.out.println("VIDEO JA ESTA EM REPRODUCAO.");
        } else {
            this.setReproduzindo(true);
            System.out.println("VIDEO SERA REPRODUZIDO.");
        }
    }

    @Override
    public void pause() {
        if (!this.isReproduzindo()) {
            System.out.println("VIDEO JA ESTA EM PAUSA.");
        } else {
            this.setReproduzindo(false);
            System.out.println("VIDEO SERA PAUSADO.");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public void apresentar() {
        System.out.println("*\tAPRESENTACAO DO VIDEO " + this.getTitulo() + "\t*");
        System.out.println("this.getTitulo():\t" + this.getTitulo());
        System.out.println("this.getAvaliacao():\t" + this.getAvaliacao());
        System.out.println("this.getViews():\t" + this.getViews());
        System.out.println("this.getCurtidas():\t" + this.getCurtidas());
        System.out.println("this.getReproduzindo():\t" + this.isReproduzindo());
    }

}
