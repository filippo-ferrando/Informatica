public class Persone {
    private String[] nomi;
    private char vocale;
    private final int NMAX = 3;
    private int nNomi = 0;

    public Persone(){
        nomi = new String[NMAX];
        nNomi = 0;
        vocale = 'A';
    }

    public Persone(char vocale){
        nomi  = new String[NMAX];
        nNomi = 0;
        this.vocale = vocale;
    }

    public void add(String nome){
        if(nNomi < NMAX) {
            nomi[nNomi] = nome;
            nNomi++;
        }
    }

    public String toString(){
        String s = "";
        s = s + vocale +"\n";

        for(int k = 0; k < nNomi; k++){
            s = s + nomi[k] + " ";
        }

        return s;
    }

    public void visualizza(){
        for(int k=0; k < nNomi; k++){
            if(nomi[k].charAt(0) == vocale){
                System.out.println(nomi[k] + " ");
            }
        }
    }
}