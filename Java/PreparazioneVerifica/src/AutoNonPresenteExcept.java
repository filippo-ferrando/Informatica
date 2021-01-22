import java.io.IOException;

public class AutoNonPresenteExcept extends IOException {

    public AutoNonPresenteExcept(){
        super("Auto non presente");
    }

    public AutoNonPresenteExcept(String message){
        super(message);
    }
}
