public class C extends Robot{
    private Materiale materiali;

    public C(String microProcessore, int memoria, Materiale materiali) throws ValoreScorrettoExcept {
        super(microProcessore, memoria);
        this.materiali = materiali;
    }

    public Materiale getMateriali() {
        return materiali;
    }

    public void leggiMateriale() {


    }

    @Override
    public String toString() {
        return "C{" +
                super.toString() +
                "materiali=" + materiali +
                '}';
    }
}
