package aula09b;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.isAberto()) {
            System.out.println("LIVRO JA ESTA ABERTO.");
        } else {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("LIVRO JA ESTA FECHADO.");
        }
    }

    @Override
    public void folhear() {
        if (this.isAberto()) {
            System.out.println("FALTAM " + (this.getTotPaginas() - this.getPagAtual()) + " PAGINAS PARA FINALIZAR O LIVRO.");
        } else {
            System.out.println("IMPOSSIVEL FOLHEAR. LIVRO FECHADO.");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("IMPOSSIVEL AVANCAR PAGINA. LIVRO FECHADO.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("IMPOSSIVEL VOLTAR PAGINA. LIVRO FECHADO.");
        }

    }

    public void apresentar() {
        System.out.println("==========");
        System.out.println("*\tAPRESENTACAO LIVRO\t*");
        System.out.println("Titulo:\t" + this.getTitulo());
        System.out.println("Autor:\t" + this.getAutor());
        System.out.println("Total de Paginas:\t" + this.getTotPaginas());
        System.out.println("Pagina Atual:\t" + this.getPagAtual());
        System.out.println("Esta Aberto:\t" + this.isAberto());
        this.getLeitor().apresentar();
        System.out.println("==========");
    }

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }
}
