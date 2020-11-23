public class Test {
    public static void main(String[] args) {
        BicchiereDadi b1 = new BicchiereDadi(6);

        for(int j = 0; j < 6; j++){
            Dado d = new Dado(6+j);
            b1.add(d);
        }
        System.out.println(b1.toString());
        System.out.println("Somma = " + b1.getSomma());
        System.out.println(b1.toString());
    }
}