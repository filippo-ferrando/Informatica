import java.util.Arrays;

public class C extends Robot {
    //(acciaio, alluminio, ferro).
    private String materiale[];
    private static String[] materialiPossibili = {"acciaio", "ferro", "alluminio"};
    private int nMateriali = 0;

    public C(int memoria, String microProcessore, String materiale) {
        super(memoria, microProcessore);
        this.materiale = new String[3];
        this.setMateriale(materiale);
    }

    public int getnMateriali() {
        return nMateriali;
    }

    public String[] getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        Tastiera input = new Tastiera();

        int k = 0;
        int tro = -1;
        if(nMateriali < 3){
            do {
                while (k < 3 && tro == -1) {
                    if (materialiPossibili[k].equalsIgnoreCase(materiale)) {
                        tro = -2;
                    }
                    k += 1;
                }
                if(tro == -1){
                    System.out.println("inserire materiale disponibile: ");
                    materiale = input.leggiString();
                    k=0;
                }
            }while(tro == -1);

            k=0;
            while(k<nMateriali && tro == -2) {
                if (this.materiale[k].equalsIgnoreCase(materiale)) {
                    tro = -3;
                }
                k += 1;
            }
            if(tro == -3){
                System.out.println("materiale già aggiunto");
            }else{
                this.materiale[nMateriali] = materiale;
                nMateriali++;
            }
        }else{
            System.out.println("Massimo raggiunto");
        }
    }

    @Override
    public String toString() {
        return "C{" +
                "materiale=" + Arrays.toString(materiale) +
                super.toString() +
                '}';
    }
}
