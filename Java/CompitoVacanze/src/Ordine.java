import java.util.Calendar;
import java.util.Date;

public class Ordine {
    private int numero;
    private Date data;
    private Robot ordinato;
    private int quantitaRob;

    public Ordine() {
        this.numero = SchoolRobot.nOrdine;
        SchoolRobot.nOrdine++;
        Calendar attuale = Calendar.getInstance();
        this.data = attuale.getTime();
        proc();
    }

    public void proc(){
        int memoria;
        String processore;
        int tipoRobot;


        Tastiera input = new Tastiera();

        System.out.println("Inserisci la memoria desiderata: ");
        memoria = input.leggiInt("Inserire intero positivo");

        System.out.println("inserisci nome processore: ");
        processore = input.leggiString();

        System.out.println("inserisci quanti robot vuoi acquistare: ");
        quantitaRob = input.leggiInt("Inserire intero positivo");


        System.out.println("inserisci 1 per tipo A\n" +
                            "inserisci 2 per tipo B\n" +
                            "inserisci 3 per tipo C\n");

        tipoRobot = input.leggiInt("inserisci intero poitivo");

        switch (tipoRobot){
            case 1:
                System.out.println("Inserire spessore: ");
                int spessore = input.leggiInt("inserisci intero positivo");

                System.out.println("inserire precisione: ");
                int precisione = input.leggiInt("Inserisci intero positivo");

                ordinato = new A(memoria, processore, spessore, precisione);

                break;

            case 2:
                System.out.println("Inserire punti saldutara al secondo: ");
                int pSS = input.leggiInt("inserisci intero positivo");

                ordinato = new B(memoria, processore, pSS);

                break;

            default:
                System.out.println("inserire materiale: ");
                String materiale = input.leggiString();

                ordinato = new C(memoria, processore, materiale);

                break;
        }


    }

    public String toString(){
        return "\nnumero dell'ordine: " + numero + "\ndata ordine:" + data + "\nspecifiche robot: " + ordinato.toString() + "\nquantità robot ordinati: " + quantitaRob;
    }





}
