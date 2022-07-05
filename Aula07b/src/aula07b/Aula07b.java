package aula07b;

public class Aula07b {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 28, 1.68f, 57.8f, 12, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 34, 1.72f, 53.8f, 13, 3, 2);
        l[3] = new Lutador("Dead Code", "Austrália", 29, 1.71f, 57.8f, 9, 2, 4);
        l[4] = new Lutador("UFOCobol", "Brasil", 30, 1.72f, 57.8f, 11, 3, 2);
        l[5] = new Lutador("Nerdaart", "EUA", 32, 1.69f, 57.8f, 13, 2, 4);

        l[3].apresentar();
        l[3].status();
        l[3].setPeso(100);
        l[3].status();
    }
}
