public class Proprietario extends Persona{
    String indirizzo;
    String codiceFiscale;

    public Proprietario(String nome, String cognome, String numeroTelefono, String indirizzo, String codiceFiscale) {
        super(nome, cognome, numeroTelefono);
        this.indirizzo = indirizzo;
        this.codiceFiscale = codiceFiscale;
    }
}
