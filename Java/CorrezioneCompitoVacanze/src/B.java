public class B extends Robot{
    private int puntiSaldatura;

    public B(String microProcessore, int memoria, int puntiSaldatura) throws ValoreScorrettoExcept {
        super(microProcessore, memoria);
        this.puntiSaldatura = puntiSaldatura;
    }

    public int getPuntiSaldatura() {
        return puntiSaldatura;
    }

    public void setPuntiSaldatura(int puntiSaldatura) {
        this.puntiSaldatura = puntiSaldatura;
    }

    @Override
    public String toString() {
        return "B{" +
                super.toString() +
                "puntiSaldatura=" + puntiSaldatura +
                '}';
    }
}
