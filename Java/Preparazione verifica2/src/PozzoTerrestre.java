public class PozzoTerrestre extends Pozzo{
    private tipoTerreno tipoDiTerreno;

    public PozzoTerrestre(boolean attivo, int capacitaEstrattiva,tipoTerreno tipoDiTerreno) {
        super(attivo, capacitaEstrattiva);
        this.tipoDiTerreno = tipoDiTerreno;
    }

    @Override
    public String toString() {
        return "PozzoTerrestre{" +
                super.toString() +
                "tipoDiTerreno=" + tipoDiTerreno +
                '}';
    }
}
