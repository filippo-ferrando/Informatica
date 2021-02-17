public class Test {
    public static void main(String[] args) {
        Cubo c1 = new Cubo(1, 2);

        Sfera s1 = new Sfera(5, 1);

        System.out.println(c1.getVolume());
        System.out.println(c1.getPeso());

        System.out.println(s1.getVolume());
        System.out.println(s1.getPeso());
    }
}
