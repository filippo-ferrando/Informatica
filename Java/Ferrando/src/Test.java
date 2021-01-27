import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        Agenzia a = new Agenzia("Nasa", new Vector<Missile>());
        Agenzia b = new Agenzia("Esa", new Vector<Missile>());

        Missile m1a = new Missile("Missile 1", new Vector<Componenti>());
    }
}
