public class A extends Robot{
    private int spessoreTaglio;
    private int precisione;

    public A(String microProcessore, int memoria, int spessoreTaglio, int precisione) throws ValoreScorrettoExcept {
        super(microProcessore, memoria);
        if(spessoreTaglio>0) this.spessoreTaglio = spessoreTaglio;
        else throw new ValoreScorrettoExcept("dimensione spesore taglio errata");
        if(precisione>0) this.precisione = precisione;
        else throw  new ValoreScorrettoExcept("dimensione precisione errata");
    }

    public int getSpessoreTaglio() {
        return spessoreTaglio;
    }

    public int getPrecisione() {
        return precisione;
    }

    public String toString() {
        return "A{" +
                super.toString() +
                ", spessoreTaglio= " + spessoreTaglio +
                ", precisione= " + precisione +
                '}';
    }
}
