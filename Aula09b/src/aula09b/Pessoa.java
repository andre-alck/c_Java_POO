package aula09b;

public final class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public void apresentar() {
        System.out.println("==========");
        System.out.println("*\tAPRESENTACAO LEITOR\t*");
        System.out.println("Nome:\t" + this.getNome());
        System.out.println("Idade:\t" + this.getIdade());
        System.out.println("Sexo:\t" + this.getSexo());
        System.out.println("==========");
    }
}
