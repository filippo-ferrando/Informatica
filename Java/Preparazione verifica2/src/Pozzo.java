public abstract class Pozzo {
    private int codiceIdentificativo;
    private boolean attivo;
    private int capacitaEstrattiva; //milioni di barili per anno
    public static final int DEFAULT_CAPACITA = 100;

    public Pozzo(boolean attivo, int capacitaEstrattiva) throws ValoreNonValidoExcept{
        this.codiceIdentificativo = GeneraCodici.creaCodici();
        this.attivo = attivo;
        if(capacitaEstrattiva < 0) {
            this.capacitaEstrattiva = Pozzo.DEFAULT_CAPACITA;
            throw new ValoreNonValidoExcept("Valore capacità estrattiva minore di 0");
        }else{
            this.capacitaEstrattiva = capacitaEstrattiva;
        }
    }

    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public int getCapacitaEstrattiva() {
        return capacitaEstrattiva;
    }

    public void attivaPozzo(){ this.attivo = true; }

    public void disattivaPozzo(){ this.attivo = false; }

    @Override
    public String toString() {
        return "Pozzo{" +
                "codiceIdentificativo='" + codiceIdentificativo + '\'' +
                ", attivo=" + attivo +
                ", capacitaEstrattiva=" + capacitaEstrattiva +
                '}';
    }
}
