package aula04b;

public class Caneta {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, float p, String c) {
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo:\t" + this.getModelo() + ".\nPonta:\t" + this.getPonta() + ".\nTampada:\t" + this.getTampada() + ".\nCor:\t" + this.getCor());
    }

}
