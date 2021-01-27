import java.io.IOException;

public class ValoreNonValido extends IOException {

    public ValoreNonValido(){
        super("Valore non valido inserito");
    }

    public ValoreNonValido(String message){
        super(message);
    }

}
