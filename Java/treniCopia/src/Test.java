public class Test {
    public static void main(String[] args) throws ValoreNonValidoException {
        Treno t = new Treno("treno1");
        t.addVagone(22.1, "anzienda", 2003, Classi.A, 200, 100);
        t.addVagone(300, "azienda", 2020, 3000, 2000, 1900);

        System.out.println(t + "\n" + "peso totale: " + t.get_peso_tot());
    }
}
