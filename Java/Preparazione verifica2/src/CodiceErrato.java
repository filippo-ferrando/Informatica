public class CodiceErrato extends RuntimeException{
    public CodiceErrato(){
        super("Valore inserito non valido");
    }

    public CodiceErrato(String messaggio) {super(messaggio);}
}
