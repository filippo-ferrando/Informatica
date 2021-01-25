import java.io.IOException;

public class ValoreNonValidoExcept extends RuntimeException {

    public ValoreNonValidoExcept(){
        super("Valore no valido inserito");
    }

    public ValoreNonValidoExcept(String message){
        super(message);
    }

}
