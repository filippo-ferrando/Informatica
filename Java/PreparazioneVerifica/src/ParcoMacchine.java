import java.util.Vector;

public class ParcoMacchine {
    private String nomeFiliale;
    private Vector<Auto> filiale;

    public ParcoMacchine() {
    }

    public ParcoMacchine(String nomeFiliale, Vector<Auto> filiale) {
        this.nomeFiliale = nomeFiliale;
        this.filiale = filiale;
    }

    public void add(Auto a){
        filiale.add(a);
    }


    public float getCostoTotale(){
        float costoTotale = 0;
        for(int k=0; k<filiale.size(); k++){
            costoTotale += filiale.get(k).getCostoTotale();
        }
        return costoTotale;
    }

    public boolean IsPiuCostosoDiesel(){
        boolean ok = true;
        float costoTotDiesel = 0;
        float costoTotElettrico = 0;

        for(int k=0; k < filiale.size(); k++){
            if(filiale.get(k) instanceof Diesel){
                costoTotDiesel += filiale.get(k).getCostoTotale();
            }else{
                costoTotElettrico += filiale.get(k).getCostoTotale();
            }
        }

        if(costoTotDiesel > costoTotElettrico){
            return ok = true;
        }else{
            return ok = false;
        }

    }

    public void datiAuto(String targa) throws AutoNonPresenteExcept{
        for(int k=0; k<filiale.size(); k++){
            if(filiale.get(k).getTarga()==targa){
                filiale.get(k).toString();
            }else throw new AutoNonPresenteExcept("Auto non trovata");

        }
    }

    public String getNomeFiliale(){
        return nomeFiliale;
    }

    public Auto getAuto(int k){
        return filiale.get(k);
    }
}
