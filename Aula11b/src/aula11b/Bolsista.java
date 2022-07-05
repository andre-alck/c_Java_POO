package aula11b;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("RENOVANDO BOLSA DE " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + "E BOLSISTA. PAGAMENTO EFETUADO.");
    }
    
}
