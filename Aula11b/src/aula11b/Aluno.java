package aula11b;

public class Aluno extends Pessoa { // não posso herdar nada da classe final, portanto, não se pode declarar como public final class Aluno extends Pessoa

    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public  void pagarMensalidade() { // não posso deixar este método final, já que existe override na classe bolsista.
        System.out.println("PAGANDO MENSALIDADE DE " + this.nome + ".");
    }
}
