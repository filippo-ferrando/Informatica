public class Cliente {
    private String denominazione;
    private String indirizzo;

    public Cliente(String denominazione, String indirizzo) {
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
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
        return "denominazione: " + getDenominazione() + "\nIndirizzo: " + getIndirizzo();
    }
}