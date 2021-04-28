public class Riparazione {
    int codice;
    String dataOraAcc;
    String dataOraRicons;
    float costoRiparazione;
    String descrizioneLavori;
    Veicolo veicoloRiparato;

    public Riparazione(int codice, String dataOraAcc, String dataOraRicons, float costoRiparazione, String descrizioneLavori, Veicolo veicoloRiparato) {
        this.codice = codice;
        this.dataOraAcc = dataOraAcc;
        this.costoRiparazione = costoRiparazione;
        this.descrizioneLavori = descrizioneLavori;
        this.veicoloRiparato = veicoloRiparato;
    }

    public void consegna(String data){
        this.dataOraRicons = data;

    }
}
