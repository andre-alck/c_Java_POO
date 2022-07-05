package aula10b;

public class Aula10b {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("PEDRO");
        p2.setNome("MARIA");
        p3.setNome("CLAUDIO");
        p4.setNome("FABIANA");
        
        p2.setCurso("INFORMATICA");
        p3.setSalario(2500.75f);
        p4.setSetor("ESTOQUE");
        
        System.out.println("APRESENTACAO:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        /*
        p1.receberAum(100.5f);
        p2.mudarTrabalho();
        p4.cancelarMatr();
        */
    }
    
}