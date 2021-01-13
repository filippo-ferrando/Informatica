public class SchoolRobot {
    private Cliente[] clienti;
    private int nClienti = 0;
    private final static int MAXCLIENTI = 100;
    public static int nOrdine = 0;

    public SchoolRobot() {
        clienti = new Cliente[MAXCLIENTI];
    }

    public void addCliente(Cliente c) throws ValoreScorrettoExcept {
        if(nClienti < MAXCLIENTI){
            clienti[nClienti] = c;
            nClienti++;
        }else{
            System.out.println("massimi clienti aggiunti");
            throw new ValoreScorrettoExcept("Massimi clienti aggiunti");
        }
    }

    public String toString(){
        return clienti[0].toString() + toString(1);
    }
    public String toString(int n){
        if(n<nClienti){
            return "\n" + clienti[n].toString() + toString(n+1);
        }
        return "";

    }
}

