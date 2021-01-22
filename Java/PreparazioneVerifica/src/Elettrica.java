public class Elettrica extends Auto{
    private final float PREZZORICARICA = 23;
    private float chilometriRicaricaCompleta;

    public Elettrica(Colori colore, String targa, float kmPercorsi, float kmRicaricaCompleta) throws ValoreNonValidoExcept{
        super(colore, targa, kmPercorsi);
        if(kmRicaricaCompleta>0) chilometriRicaricaCompleta = kmRicaricaCompleta;
        else throw new ValoreNonValidoExcept("Chilometri con una ricarica non valido");
    }

    public float getChilometriRicaricaCompleta() {
        return chilometriRicaricaCompleta;
    }

    public void setChilometriRicaricaCompleta(float chilometriRicaricaCompleta) {
        this.chilometriRicaricaCompleta = chilometriRicaricaCompleta;
    }

    public float getCostoTotale(){
        float costoTotale;
        costoTotale = getKmPercorsi() / (chilometriRicaricaCompleta * PREZZORICARICA);
        return costoTotale;
    }

    @Override
    public String toString() {
        return "Elettrica{" +
                "PREZZORICARICA=" + PREZZORICARICA +
                ", chilometriRicaricaCompleta=" + chilometriRicaricaCompleta +
                '}';
    }
}
