package Aggregazione;

public class Canzone {
    private String titolo;
    private String autore;
    private int durataS;

    private final int DURATA_S = 60;

    public Canzone(String titolo, String autore, int durataS) {
        this.titolo = titolo;
        this.autore = autore;
        if(durataS <= 0){
            this.durataS = DURATA_S;
        }else{
            this.durataS = durataS;
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public double getDurataS() {
        return durataS;
    }

    @Override
    public String toString() {
        return "Canzone{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", durataS=" + durataS +
                '}';
    }
}
