import java.util.Date;

public class Direttore extends Persona{
    Date natoIl;

    public Direttore(String nome, String cognome, String numeroTelefono, Date natoIl) {
        super(nome, cognome, numeroTelefono);
        this.natoIl = natoIl;
    }
}
