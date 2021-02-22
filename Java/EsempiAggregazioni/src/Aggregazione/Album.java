package Aggregazione;

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

    public void addCanzone(Canzone c){
        this.brani.add(c);
    }

    @Override
    public String toString() {
        String s = " " + titolo + "\n";
        for(Canzone c: brani){
            s += "\t" + c.toString() + "\n";
        }
        return s;
    }
}
