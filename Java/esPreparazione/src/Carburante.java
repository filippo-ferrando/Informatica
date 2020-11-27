public class Carburante {
    private float prezzo;
    private String nome;
    private String nomiPossibili[];
    private static final int NNOMI = 4;

    public Carburante(){
        nomiPossibili = new String[NNOMI];
        nomiPossibili[0] = "benzina";
        nomiPossibili[1] = "diesel";
        nomiPossibili[2] = "GPL";
        nomiPossibili[3] = "metano";
        nome = "benzina";
        prezzo = (float) 1.5;
    }

    public Carburante(float p, String n) {
        nomiPossibili = new String[NNOMI];
        nomiPossibili[0] = "benzina";
        nomiPossibili[1] = "diesel";
        nomiPossibili[2] = "GPL";
        nomiPossibili[3] = "metano";

        for (int k = 0; k < NNOMI; k++) {
            if (n.equalsIgnoreCase(nomiPossibili[k])) {
                nome = n;
                k = NNOMI;
            } else {
                nome = "elettrico";
            }
            if (p < 0) {
                prezzo = 1;
            } else {
                prezzo = p;
            }
        }
    }

    public void setPrezzo(int p){
        if(p < 0) {
            prezzo = 1;
        }else {
            prezzo = p;
        }
    }

    public void setNome(String n){
        for(int k = 0; k < NNOMI; k++){
            if(n.equalsIgnoreCase(nomiPossibili[k])) {
                nome = n;
                k = NNOMI;
            }else{
                nome = "elettrico";
            }
        }
    }

    public float getPrezzo(){
        return prezzo;
    }

    public String getNome(){
        return nome;
    }

    public boolean uguale(float p){
        boolean ok = false;
        if(prezzo == p) {
            ok = true;
        }
        return ok;
    }

    public String toString(){
        String s = "";
        return  s + "Nome: " + getNome() + " Prezzo: " + getPrezzo();
    }
}
