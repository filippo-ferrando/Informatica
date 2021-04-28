import java.util.Vector;
import java.util.Date;

public class garage {
    Vector<piani> npiani;
    float costoOrario;
    static String lettere = "abcdefghijklmnopqrstuvwxyz";

    public garage(float costoOrario) {
        this.npiani = new Vector<piani>();
        this.costoOrario = costoOrario;
    }

    public class piani{
        char lettera;
        float altezzaMax;
        Vector<postiAuto> postiauto;

        public piani(char lettera, float altezzaMax) {
            this.lettera = lettera;
            this.altezzaMax = altezzaMax;
            this.postiauto = new Vector<postiAuto>();
        }

        public class postiAuto{
            int codice;
            boolean occupato;
            float oraIngresso;

            public postiAuto(int codice, boolean occupato, float oraIngresso) {
                this.codice = codice;
                this.occupato = occupato;
                this.oraIngresso = oraIngresso;
            }
        }

        public void npostiauto() {
            int i = 0;
            for(postiAuto p: postiauto){
                if(p.occupato){
                    System.out.println(p.codice);
                }
            }
        }

        public float getAltezzaMax() {
            return altezzaMax;
        }
    }

    public void npiani(float altezzaAuto){
        int i = 0;
        for(piani p: npiani){
            if(altezzaAuto > p.getAltezzaMax()){
                System.out.println(p.lettera);
            }
        }
    }

    public void occupaPosto(int codicePosto, char codicePiano){
        for(piani p: npiani){
            if(p.lettera == codicePiano){
                for(piani.postiAuto c: p.postiauto){
                    if(c.codice == codicePosto){
                        c.occupato = true;
                    }
                }
            }
        }
    }

    public static biglietto daiBiglietto(int codicePosto, int codicePiano){
        return new biglietto(codicePosto, new Date().toString(), codicePiano);
    }

    public void esci(int codicePosto, int codicePiano, biglietto ticket){
        for(piani p: npiani){
            if(p.lettera == codicePiano){
                for(piani.postiAuto c: p.postiauto){
                    if(c.codice == codicePosto){
                        c.occupato = false;
                    }
                }
            }
        }
        int prezzo = 0;
        prezzo = ()

    }
}
