/*
L'azienda ha necessità di memorizzare gli ordini dei  clienti.
   Per ogni ordine occorre memorizzare la denominazione del cliente, indirizzo, numero d'ordine, data  ordine e l'elenco dei robot ordinati.
  Si proceda a:
- implementare il metodo public void addCliente() in grado di richiedere all'utente l'inserimento da tastiera  dei dati di un cliente ed aggiungerlo all'elenco clienti
 */

public class A extends Robot{
    //saldatura
    private int spessore;
    private int precisione;

    public A(int memoria, String processore, int spessore, int precisione){
        super (memoria, processore);
        this.spessore = spessore;
        this.precisione = precisione;
    }

    public int getSpessore() { return spessore; }

    public int getPrecisione() {
        return precisione;
    }

    public void setSpessore(int spessore) {
        this.spessore = spessore;
    }

    public void setPrecisione(int precisione) {
        this.precisione = precisione;
    }

    @Override
    public String toString() {
        return "A{" +
                "spessore=" + spessore +
                ", precisione=" + precisione +
                super.toString() +
                '}';
    }
}
