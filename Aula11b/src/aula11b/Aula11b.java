package aula11b;

public class Aula11b {

    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setIdade(19);
        v1.setNome("ANDRE SANTOS ALCKMIN DE CARVALHO");
        v1.setSexo("MASCULINO");
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("JACKELINE KANEKO");
        a1.setMatricula(2912);
        a1.setIdade(30);
        a1.setSexo("FEMININO");
        //System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("GUSTAVO HENRIQUE ANDRADE FERREIRA");
        b1.setMatricula(1202);
        b1.setIdade(19);
        b1.setSexo("MASCULINO");
        b1.pagarMensalidade();
        //System.out.println(b1.toString());
    }

}
