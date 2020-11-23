public class Giocatore {
    private String nome;
    private double valore;
    private int eta;

    public Giocatore(String nome, int eta){
        this.nome = nome;
        if(eta > 0) this.eta = eta;
        else this.eta = 20;
    }

    public Giocatore(String nome, int eta, double valore){
        this.nome = nome;
        if(eta > 0) this.eta = eta;
        else this.eta = 20;

        if(valore >= 0) this.valore = valore;
        else this.valore = 0;
    }

    public String getNome(){
        return nome;
    }

    public double getPunteggio(){
        return valore;
    }

    public void setPunteggio(double NuovoPunteggio){
        if(NuovoPunteggio >= 0) valore = NuovoPunteggio;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int e){
        if(e > 0) eta = e;
    }

    public String toString(){
        return "nome= " + nome + ", eta= " + eta + ", punteggio= " + valore;
    }
}
