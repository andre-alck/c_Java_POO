package aula15b;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }

    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public void apresentar() {
        System.out.println("*\tAPRESENTACAO DO GAFANHOTO " + this.getNome() + "\t*");
        System.out.println("this.getNome():\t" + this.getNome());
        System.out.println("this.getIdade():\t" + this.getIdade());
        System.out.println("this.getSexo():\t" + this.getSexo());
        System.out.println("this.getExperiencia():\t" + this.getExperiencia());
        System.out.println("this.getLogin():\t" + this.getLogin());
        System.out.println("this.getTotAssistido():\t" + this.getTotAssistido());
    }
}
