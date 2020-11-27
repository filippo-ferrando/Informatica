public class Distributore {
    private Carburante vet[];
    private String nome;
    private String indirizzo;
    private int cnt;
    private final int NMAX = 10;

    public Distributore(String n, String i){
        vet = new Carburante[NMAX];
        nome = n;
        indirizzo = i;
        cnt = 0;
    }

    public void add(Carburante c){
        if(cnt < NMAX){
            vet[cnt] = c;
            cnt++;
        }
    }

    public void setNomeD(String n){
        nome = n;
    }

    public void setIndirizzo(String i){
        indirizzo = i;
    }

    public String getNomeD(){
        return nome;
    }

    public String getIndirizzo(){
        return indirizzo;
    }

    public String toString(){
        String s = "";
        for(int k = 0; k < cnt; k++){
            s = s + vet[k].toString() + "\n";
        }
        return s;
    }

}
