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
        float costoTotDiesel = 0;
        float costoTotElettrico = 0;

        for(int k=0; k < filiale.size(); k++){
            if(filiale.get(k) instanceof Diesel){
                costoTotDiesel += filiale.get(k).getCostoTotale();
            }else{
                costoTotElettrico += filiale.get(k).getCostoTotale();
            }
        }

        if(costoTotDiesel < costoTotElettrico){
            return true;
        }else{
            return false;
        }

    }

    public float getCostoDiesel(){
        float costoDiesel = 0f;

        for(int k=0; k<filiale.size(); k++){  //for(Auto a: filiale)
            if(filiale.get(k) instanceof Diesel){
                costoDiesel += filiale.get(k).getCostoTotale();
            }
        }
        return costoDiesel;
    }

    public float getCostoElettrico(){
        float costoElettrico = 0f;

        for(Auto a: filiale){
            if(a instanceof Elettrica){
                costoElettrico += a.getCostoTotale();
            }

        }
        return  costoElettrico;
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

    public Vector<Auto> getFiliale() {
        return filiale;
    }

    @Override
    public String toString() {
        return "nomeFiliale='" + nomeFiliale + '\'' +
                " costoTotale= " + this.getCostoTotale() +
                " autoDieselCosto= " + this.getCostoDiesel() +
                " autoElettricaCosto= " + this.getCostoElettrico() +
                " isPiùEconomicoDiesel= " + this.IsPiuCostosoDiesel() +
                '}';
    }
}
