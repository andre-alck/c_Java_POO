package aula05b;

public class Aula05b {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        System.out.println(p1.getSaldo());
        p1.pagarMensal();
        System.out.println(p1.getSaldo());

        System.out.println("-");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        System.out.println(p2.getSaldo());
        p2.pagarMensal();
        System.out.println(p2.getSaldo());
    }

}
