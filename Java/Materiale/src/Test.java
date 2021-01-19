import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<Solido> vet = new Vector<Solido>(4);

        vet.add(new Cubo(4,2));
        vet.add(new Sfera(4000, 15));
        vet.add(new Cubo(25, 564));
        vet.add(new Sfera(325345,56734));


        System.out.println(vet.toString());

    }
}
