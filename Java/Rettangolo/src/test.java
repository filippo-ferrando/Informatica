public class test {
    public static void main(String[] args) {
        Rettangolo r;
        r = new Rettangolo();
        r.setAltezza(2);
        r.setBase(3);
        System.out.println("L'area e': " + r.getArea());
        System.out.println("L'perimetro e': " + r.getPerimetro());
    }
}
