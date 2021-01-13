import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ordine {
    private GregorianCalendar data;
    private Robot robotOrdinati[];
    private int numeroRob;
    private final static int DIM_MAX = 20;
    private Cliente cliente;

    public Ordine(GregorianCalendar data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        robotOrdinati = new Robot[DIM_MAX];
    }

    public GregorianCalendar getData() {
        return data;
    }

    public Robot[] getRobotOrdinati() {
        return robotOrdinati;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void addRobot(Robot r){
        if(numeroRob<DIM_MAX){
            robotOrdinati[numeroRob] = r;
            numeroRob++;
        }else{

        }
    }

    public void proc() throws ValoreScorrettoExcept {
        int memoria;
        String processore;
        int tipoRobot;


        Tastiera input = new Tastiera();

        System.out.println("Inserisci la memoria desiderata: ");
        memoria = input.leggiInt("Inserire intero positivo");

        System.out.println("inserisci nome processore: ");
        processore = input.leggiString();

        System.out.println("inserisci quanti robot vuoi acquistare: ");
        numeroRob = input.leggiInt("Inserire intero positivo");

        for(int i=0;i<numeroRob; i++){
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

                    addRobot(new A(processore, memoria, spessore, precisione));

                    break;

                case 2:
                    System.out.println("Inserire punti saldutara al secondo: ");
                    int pSS = input.leggiInt("inserisci intero positivo");

                    addRobot(new B(processore, memoria, pSS));

                    break;

                default:
                    System.out.println("inserire materiale: ");
                    String materiale = input.leggiString();

                    if(materiale.equalsIgnoreCase("ferro")){
                        addRobot(new C(processore, memoria, Materiale.FERRO));
                    }else{
                        if(materiale.equalsIgnoreCase("alluminio")){
                            addRobot(new C(processore, memoria, Materiale.ALLUMINIO));
                        }else{
                            addRobot(new C(processore, memoria, Materiale.ACCIAIO));
                        }
                    }

                    break;
            }
        }
    }

    public String toString(){
        String s = "data " + this.data + "\nordinato da " + cliente + "\n";

        for(int k=0; k<numeroRob; k++){
            s += robotOrdinati[k].toString() + "\n";
        }
        return s;
    }





}