public class Macchina {
    private String modello;
    private String colore;
    private float prezzo;


    public Macchina(String modello, String colore, float prezzo){
        int cnt=0, tro=-1;
        String[] listaColori = {"rosso", "grigio", "nero", "bianco"};
        this.modello = new String();
        this.modello = modello;
        this.colore = new String();
        this.colore = colore;
        this.prezzo = prezzo;


        while(cnt<4 && tro==-1){
            if(colore.equalsIgnoreCase(listaColori[cnt]) == true){
                tro = cnt;
            }
            cnt++;
        }
        if(tro==-1){
            this.colore = "grigio";
        }else{
            this.colore = listaColori[tro];
        }
    }

    public void setPrezzo(float prezzo){
        this.prezzo = prezzo;
    }

    public String getModello(){
        return this.modello;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public String getColore() {
        return this.colore;
    }

    public String toString(){
        String temp = new String();
        temp = this.modello +" "+ this.colore +" "+ this.prezzo;
        return temp;
    }

}
