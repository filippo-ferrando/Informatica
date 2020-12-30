public class SchoolRobot {
    private Cliente[] clienti;
    private int nClienti = 0;
    private final int MAXCLIENTI = 100;
    public static int nOrdine = 0;

    public SchoolRobot() {
        clienti = new Cliente[MAXCLIENTI];
    }

    public void addCliente(){
        if(nClienti < MAXCLIENTI){
            clienti[nClienti] = new Cliente();
            nClienti++;
        }else{
            System.out.println("massimi clienti aggiunti");
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
