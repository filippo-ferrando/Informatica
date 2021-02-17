import java.io.IOException;

public class ValoreNonValido extends IOException {
    public ValoreNonValido(){
        super("il valore non è valido");
    }

    public ValoreNonValido(String errore){
        super(errore);
    }

}
