public class Test {
    public static void main(String[] args) {
        Carburante c1 = new Carburante();
        Carburante c2 = new Carburante(2, "GPL");
        Carburante c3 = new Carburante(4, "ciao");
        Carburante c4 = new Carburante();

        System.out.println("carburante 3: " + c3.toString());

        c1.setNome("metano");
        System.out.println("carburante 1: " + c1.toString());

        System.out.println("Prezzo carburante 2: " + c2.getPrezzo());

        c4.setPrezzo(12);
        System.out.println("carburante 4: " + c4.toString());

        System.out.println("il prezzo di carburante 4 passato è uguale? " + c4.uguale(12));

        Distributore d1 = new Distributore("gino", "via mazzoli 4");
        d1.add(c1);
        d1.add(c2);
        d1.add(c3);
        d1.add(c4);

        System.out.println("NOME DISTRIBUTORE 1: " + d1.getNomeD());
        System.out.println("INDIRIZZO DISTRIBUTORE 1: " + d1.getIndirizzo());

        System.out.println("DISTRIBUTORE 1: " + d1.toString());
    }
}
