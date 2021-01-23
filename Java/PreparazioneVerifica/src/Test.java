public class Test {
    public static void main(String[] args) {

        Azienda a = new Azienda();
        ParcoMacchine p = new ParcoMacchine();

        Elettrica e = new Elettrica(Colori.BIANCO, "acbdgsj", 0, 5000);

        p.add(e);

        a.add(p);

        a.toString();
    }
}
