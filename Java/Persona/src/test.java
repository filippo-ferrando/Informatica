public class test {
    public static void main(String[] args){
        Persone vNomi = new Persone('U');

        vNomi.add("Ugo");
        vNomi.add("Alberto");
        vNomi.add("Anna");

        vNomi.visualizza();

        System.out.println(vNomi.toString());
    }
}
