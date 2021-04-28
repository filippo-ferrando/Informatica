public class Veicolo {
    Veicoli modello;
    String tipo;
    String targa;
    int annoImmatricolazione;
    Proprietario appartieneA;

    public Veicolo(Veicoli modello, String tipo, String targa, int annoImmatricolazione, Proprietario appartieneA) {
        this.modello = modello;
        this.tipo = tipo;
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        this.appartieneA = appartieneA;
    }
}
