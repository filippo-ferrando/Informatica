public class B extends Robot {
    private int puntiSaldatura;

    public B(int memoria, String microProcessore, int pSS) {
        super(memoria, microProcessore);
        this.puntiSaldatura = pSS;
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
                "puntiSaldatura=" + puntiSaldatura +
                super.toString() +
                '}';
    }
}
