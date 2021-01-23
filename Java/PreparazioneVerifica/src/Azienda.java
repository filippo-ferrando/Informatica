import java.util.Vector;

public class Azienda {
    private Vector<ParcoMacchine> parcoMacchine;

    public Azienda(Vector<ParcoMacchine> parcoMacchine) {
        this.parcoMacchine = parcoMacchine;
    }

    public Azienda() {
    }

    public float getCostoTotale(){
        float costoTotale = 0;
        for(int k=0; k<parcoMacchine.size();k++){
            costoTotale += parcoMacchine.get(k).getCostoTotale();
        }
        return costoTotale;
    }

    public void datiAuto(String targa, String filiale) throws AutoNonPresenteExcept{
        int k=0;
        int i = 0;
        boolean ok = false;
        boolean ok1 = false;
        while(k<parcoMacchine.size() && ok==false){
            if(parcoMacchine.get(k).getNomeFiliale().equals(filiale)){
                ok = true;
                while(i<parcoMacchine.size() && ok1 == false ) {
                    if (parcoMacchine.get(k).getAuto(i).getTarga().equals(targa)) {
                        ok1 = true;
                        System.out.println(parcoMacchine.get(k).getAuto(i).toString());
                    } else {
                        i++;
                    }
                }
            }else{
                k++;
            }
        }
        if(ok == false){
            throw new AutoNonPresenteExcept("Filiale non esistente");
        }else if (ok1 == false){
            throw new AutoNonPresenteExcept("Auto non esiste");
        }
    }

    public void add(ParcoMacchine p){
        parcoMacchine.add(p);
    }

}
