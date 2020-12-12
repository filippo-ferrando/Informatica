//classe libro -> titolo, autore, genere (elenco fisso -> romanzo, horror, giallo), prezzo
//costruttore con tutti i componenti
//set solo prezzo, tutti i get
//costruttore, to string
//controllo prezzo

//classe mensola -> DIM, agg libro, elimina libro, tostring, valore mensola, valore medio

public class Mensola {
    private Libro vet[];
    private static int DIM = 20;
    private int cnt;

    public Mensola(){
        DIM = 30;
        vet = new Libro[DIM];
        cnt = 0;

    }

    public void aggLibro(Libro l){
        if(cnt<DIM){
            vet[cnt] = l;
            cnt++;
        }
    }

    public float vMensola(){
        float somma = 0;
        for(int k=0; k<cnt; k++){
            somma = somma + vet[k].getPrezzo();
        }
        return somma;
    }

    public float vMedioMensola(){
        float somma=0, media;
        for(int k=0; k<cnt; k++){
            somma = somma + vet[k].getPrezzo();
        }
        media = somma / cnt;
        return media;
    }

    public String toString(){
        String s = " ";
        for(int k=0; k<cnt; k++){
            s = s + vet[k].toString() + "\n";
        }
        return s;
    }


}
