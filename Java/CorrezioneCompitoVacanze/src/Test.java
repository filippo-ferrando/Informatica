import javax.print.attribute.standard.OrientationRequested;
import java.lang.ref.Cleaner;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) throws ValoreScorrettoExcept {
        SchoolRobot s = new SchoolRobot();
        Robot a = new A("ryzen", 32453, 123, 2);
        Cliente c1 = new Cliente("Giovanni", "Via rossi paolo");
        Ordine o1 = new Ordine(new GregorianCalendar(), c1);
        o1.addRobot(a);
        s.addCliente(c1);




        System.out.println(s.toString());
        System.out.println("\n");
        System.out.println(o1.toString());

    }
}



/*
 public Cliente() throws ValoreScorrettoExcept {
        Tastiera input = new Tastiera();
        System.out.println("inserisci il nome del cliente: ");
        this.denominazione = input.leggiString();

        System.out.println("inserisci l'indirizzo del cliente: ");
        this.indirizzo = input.leggiString();

        ordine = new Ordine();
    }
 */