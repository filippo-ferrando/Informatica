import java.io.IOException;

public class ValoreScorrettoExcept extends IOException{
    public ValoreScorrettoExcept(){
        super("Valore Scorretto");
    }

    public ValoreScorrettoExcept(String message){
        super(message);
    }

}
