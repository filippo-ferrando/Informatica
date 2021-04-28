public class ValoreNonValidoException extends Exception{
    public ValoreNonValidoException() {
        super("valore non valido");
    }

    public ValoreNonValidoException(String message) {
        super(message);
    }
}
