package aula15b;

public class Aula15b {

    public static void main(String[] args) {
        Video[] v = new Video[5];

        v[0] = new Video();
        v[0].setTitulo("TITULO DO VIDEO");
        v[0].setAvaliacao("EXCELENTE");
        v[0].setViews(99999);
        v[0].setCurtidas(v[0].getViews());
        v[0].setReproduzindo(true);
        //v[0].apresentar();

        v[0].pause();
        v[0].pause();
        v[0].play();
        v[0].play();
        v[0].like();

        System.out.println("this.getCurtidas():\t" + v[0].getCurtidas());

        Gafanhoto[] g = new Gafanhoto[5];

        g[0] = new Gafanhoto();
        g[0].setNome("JOAO");
        g[0].setIdade(19);
        g[0].setSexo("MASCULINO");
        g[0].setExperiencia(10);
        g[0].setLogin("JOAO@GMAIL.COM");
        g[0].setTotAssistido(1);
        //g[0].apresentar();

        g[0].ganharExp();
        g[0].viuMaisUm();
        //System.out.println("g[0].getExperiencia(): " + g[0].getExperiencia());
        //System.out.println("g[0].getTotAssistido(): " + g[0].getTotAssistido());
        
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        vis[0].avaliar(5);
        vis[0].avaliar(50.5f);
    }

}
