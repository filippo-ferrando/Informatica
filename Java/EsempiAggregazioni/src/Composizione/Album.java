package Composizione;

import Aggregazione.Canzone;

import java.util.Vector;

public class Album {
    private String titolo;
    private Vector<Canzone> brani;

    public Album(String titolo, Vector<Canzone> brani) {
        this.titolo = titolo;
        this.brani = brani;
    }

    public String getTitolo() {
        return titolo;
    }

    public Vector<Canzone> getBrani() {
        return brani;
    }

    public void addCanzone(String titolo, String autore, int durataS){
        this.brani.add(new Canzone(titolo, autore, durataS));
    }

    @Override
    public String toString() {
        String s = " " + titolo + "\n";
        for(Canzone c: brani){
            s += "\t" + c.toString() + "\n";
        }
        return s;
    }
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
}
