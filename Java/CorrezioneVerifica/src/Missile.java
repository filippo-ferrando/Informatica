import java.util.Vector;

public class Missile {
    private String nome;
    private Vector<Componente> componeti;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Missile() {
       componeti= new Vector<Componente>();
       nome= "DEFAULT";
    }

    public Missile(String nome) {
        this.nome = nome;
        componeti= new Vector<Componente>();

    }

    public void add(Componente comp){
        componeti.add(comp);
    }

    public double getPesoMissile(){
        double pesoTotale=0;
        for(int k=0; k<componeti.size(); k++) {
            pesoTotale=pesoTotale+componeti.get(k).getPeso();
        }
        return pesoTotale;
    }

    private boolean spintaSuff(){
        double spintaTot=0;
        for(Componente c :componeti){
            if(c instanceof Motore){
                spintaTot= spintaTot+((Motore) c).getSpinta();
            }
        }
        if(spintaTot>=getPesoMissile()){
            return true;
        }else{
            return false;
        }
    }

    private boolean capacitaTotSuff(){
        double capacita= 0;
        double consumoOrario=0;

        for(Componente c: componeti){
            if(c instanceof SerbatoioCarburante){
                capacita= capacita + ((SerbatoioCarburante) c).getCapacita();
            }else{
                if(c instanceof Motore){
                    consumoOrario += ((Motore) c).getConsumoOrario();
                }
            }
        }

        if(capacita >= consumoOrario){
            return true;
        }else{
            return false;
        }
    }
    /*
    public boolean isInGradoDiVolare(){
        boolean isInGrado;
        double pesoTot= getPesoMissile();
        double consumoTot=0;
        double litriTot=0;
        double spinta=0;

        for (int k=0;k<componeti.size();k++){
            if(componeti.get(k) instanceof Motore){
                spinta=spinta+((Motore) componeti.get(k)).getSpinta();
                consumoTot=consumoTot+((Motore) componeti.get(k)).getConsumoOrario();
            }else{
                if(componeti.get(k) instanceof SerbatoioCarburante){
                    consumoTot=consumoTot+((SerbatoioCarburante) componeti.get(k)).getCapacita();
                }
            }
        }

        if(spinta<pesoTot){
            return false;
        }else{
            if(consumoTot>litriTot){
                return true;
            }else{
                return false;
            }
        }
    }

*/

    public boolean puoVolare(){
            return spintaSuff() && capacitaTotSuff();
    }

    public String toString() {
        return "Missile{" +
                "nome='" + nome + '\'' +
                ", componeti=" + componeti +
                '}';
    }


}
