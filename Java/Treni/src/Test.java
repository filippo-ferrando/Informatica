public class Test {
    public static void main(String[] args) throws ValoreNonValidoExcept{
        Treno t = new Treno("treno1", 4000);
        t.addVagoneMerci(1000, "Fiat", 2000, 1500, 5000, 400);
        t.addVagonePasseggeri(3000, "Ferrari", 1990, Treno.Classi.B, 300, 150);
        t.addVagonePasseggeri(8000, "Lamborghini", 2020, Treno.Classi.A, 700, 100);
        t.addVagonePasseggeri(1000, "McLaren", 1977, Treno.Classi.C, 50, 12);

        System.out.println(t.toString());
        System.out.println("\n");

        t.remove(1);

        System.out.println(t.toString());
        System.out.println("\n");

        t.addVagoneMerci(400, "Fiat", 2010, 1500, 800, 400);

        System.out.println(t.toString());
        System.out.println("\n");
    }
}
