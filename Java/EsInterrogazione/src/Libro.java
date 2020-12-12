//classe libro -> titolo, autore, genere (elenco fisso -> romanzo, horror, giallo), prezzo
//costruttore con tutti i componenti
//set solo prezzo, tutti i get
//costruttore, to string
//controllo prezzo

//classe mensola -> DIM, agg libro, elimina libro, tostring, valore mensola, valore medio

public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private String generiPossibili[];
    private float prezzo;
    private static final int NGENERI = 3;
    private static final String GENERE_DEFAULT = "romanzo";



    public Libro(){
        generiPossibili = new String[NGENERI];
        generiPossibili[0] = "romanzo";
        generiPossibili[1] = "horror";
        generiPossibili[2] = "giallo";

        titolo = "I gialli di Agatha Christie";
        autore = "Agatha Christie";
        genere = "giallo";
        prezzo = (float) 14.6;
    }

    public Libro(String titolo, String autore, String genere, float prezzo){
        generiPossibili = new String[NGENERI];
        generiPossibili[0] = "romanzo";
        generiPossibili[1] = "horror";
        generiPossibili[2] = "giallo";

        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;

        for(int k=0; k<NGENERI; k++){
            if(genere.equalsIgnoreCase(generiPossibili[k])){
                this.genere = genere;
            }else{
                this.genere = GENERE_DEFAULT;
            }
        }
    }

    public void setPrezzo(float p){
        prezzo = p;
    }

    public String getTitolo(){return titolo;}
    public String getAutore(){return autore;}
    public String getGenere(){return genere;}
    public float getPrezzo(){return prezzo;}

    public String toString(){
        String s = " ";
        return s + "Titolo: " + getTitolo() + " Autore: " + getAutore() + " Genere: " + getGenere() + " Prezzo: " + getPrezzo();
    }
}
