class BicchiereDadi {
    private int nDadi = 0;
    private Dado[] d;
    int nE = 0;

    public BicchiereDadi(int numDadi){
        this.nDadi = numDadi;
        d = new Dado[nDadi];
    }

    public void add(Dado dado){
        if(nE < nDadi) {
            this.d[nE] = dado;
            nE++;
        }
    }

    public int getSomma() {
        int somma = 0;
        for(int k = 0; k < nDadi; k++) {
            somma = somma + d[k].getLancio();
        }
        return somma;
    }

    public String toString(){
        String s = "";
        for(int k = 0; k < nE; k++){
            s = s + d[k].toString() + " ";
        }
        return s;
    }
}