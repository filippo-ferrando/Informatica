public class PozzoMarino extends Pozzo {
    private double profondita;
    public static final double DEFAULT_PROFONDITA = 1000.0;

    public PozzoMarino(boolean attivo, int capacitaEstrattiva,double profondita) throws ValoreNonValidoExcept {
        super(attivo, capacitaEstrattiva);
        if(profondita <= 0) {
            this.profondita = PozzoMarino.DEFAULT_PROFONDITA;
            throw new ValoreNonValidoExcept("Profondità non valida");
        }else{
            this.profondita = profondita;
        }
    }

    @Override
    public String toString() {
        return "PozzoMarino{" +
                super.toString() +
                "profondita=" + profondita +
                '}';
    }
}
