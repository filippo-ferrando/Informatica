import java.io.IOException;

public class MissileNonPresente extends RuntimeException{
    public MissileNonPresente(){
        super("Missile non presente");
    }

    public MissileNonPresente(String message){
        super(message);
    }
}
