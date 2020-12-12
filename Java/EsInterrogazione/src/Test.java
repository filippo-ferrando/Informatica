public class Test {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("la storia infinita", "non ricordo", "avventura", (float)23.4);

        Mensola m1 = new Mensola();

        m1.aggLibro(l1);
        m1.aggLibro(l2);

        System.out.println(m1.vMensola());
        System.out.println(m1.vMedioMensola());

        System.out.println(m1.toString());

    }
}
