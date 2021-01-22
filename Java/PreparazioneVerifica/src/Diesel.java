public class Diesel extends Auto{
    private final static float PREZZO_LITRO = (float)1.4;
    private float litroChilometro;

    public Diesel(Colori colore, String targa, float kmPercorsi, float litroChilometro) throws ValoreNonValidoExcept{
        super(colore, targa, kmPercorsi);
        if(litroChilometro>0) this.litroChilometro = litroChilometro;
        else throw new ValoreNonValidoExcept("prezzo litro/chilometro non valido");
    }

    public static float getPrezzoLitro() {
        return PREZZO_LITRO;
    }

    public float getLitroChilometro() {
        return litroChilometro;
    }

    public void setLitroChilometro(float litroChilometro) {
        this.litroChilometro = litroChilometro;
    }

    public float getCostoTotale(){
        float costoTotale;
        costoTotale = getKmPercorsi() / (getLitroChilometro() * PREZZO_LITRO);
        return costoTotale;
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "litroChilometro=" + litroChilometro +
                '}';
    }
}
//kmAnno / (km/1litro * prezzo litro)