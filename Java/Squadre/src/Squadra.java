public class Squadra {
    private Giocatore[] squadra;
    private String nome;
    private int nGiocatore;
    private final int N_MAX_GIOCATORI = 200;

    public Squadra(String n){
        nome = n;
        squadra = new Giocatore[N_MAX_GIOCATORI];
        nGiocatore = 0;
    }

    public void addGiocatore(Giocatore g){
        if(nGiocatore < N_MAX_GIOCATORI)
            squadra[nGiocatore++] = g;
    }

    public void setPunteggio(String nome, double valore){
        int tro = -1;
        int k =0;
        while(tro == -1 && k < nGiocatore){
            if(squadra[k].getNome().equals(nome)) tro = k;
            k++;
        }
        if(tro != -1)
            squadra[tro].setPunteggio(valore);
        else System.out.println("non esiste questo giocatore");

    }

    public double getPunteggioMedio(){
        double somma = 0;
        for(int i = 0; i < nGiocatore; i++)
            somma += squadra[i].getPunteggio();
        if(nGiocatore != 0)
            return somma/nGiocatore;
        else return 0;
    }

    public void passatoAnno(){
        for(int i =0; i < nGiocatore; i++)
            squadra[i].setEta(squadra[i].getEta() +1);
    }

    public String toString(){
        String str = nome;
        for(int i = 0; i < nGiocatore;i++)
            str = str + " " + squadra[i].getPunteggio() + " " + squadra[i].getEta() + " " + squadra[i].getNome() + "\n";
        return str;
    }
}