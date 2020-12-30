public class Cliente {
    private Ordine ordine;
    private String denominazione;
    private String indirizzo;

    public Cliente(String denominazione, String indirizzo) {
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
    }

    public Cliente() {
        Tastiera input = new Tastiera();
        System.out.println("inserisci il nome del cliente: ");
        this.denominazione = input.leggiString();

        System.out.println("inserisci l'indirizzo del cliente: ");
        this.indirizzo = input.leggiString();

        ordine = new Ordine();
    }

    public void cambiaOrdine(){
        this.ordine = new Ordine();
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String toString(){
        return ordine.toString() + "\ndenominazione: " + getDenominazione() + "\nIndirizzo: " + getIndirizzo();
    }
}
