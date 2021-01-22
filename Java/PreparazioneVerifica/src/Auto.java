public abstract class Auto {
    private Colori colore;
    private String targa;
    private float kmPercorsi = 0;

    public Auto(Colori colore, String targa, float kmPercorsi) throws ValoreNonValidoExcept{
        this.targa = targa;
        this.kmPercorsi = kmPercorsi;
        this.colore = colore;
    }

    public Colori getColore() {
        return colore;
    }

    public void setColore(Colori colore) {
        this.colore = colore;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public float getKmPercorsi() {
        return kmPercorsi;
    }

    public void setKmPercorsi(float kmPercorsi) {
        this.kmPercorsi = kmPercorsi;
    }


    public abstract float getCostoTotale();

    @Override
    public String toString() {
        return "Auto{" +
                "colore=" + colore +
                ", targa='" + targa + '\'' +
                ", kmPercorsi=" + kmPercorsi +
                '}';
    }
}
