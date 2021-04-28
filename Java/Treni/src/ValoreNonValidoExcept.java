public class ValoreNonValidoExcept extends Exception{
    public ValoreNonValidoExcept(){super("valore non valido");}

    public ValoreNonValidoExcept(String message){super(message);}
}
