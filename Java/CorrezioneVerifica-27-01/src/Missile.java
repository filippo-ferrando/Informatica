import java.util.Vector;

public class Missile {
    private String nome;
    private Vector<Componente> componenti;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Missile() {
       componenti = new Vector<Componente>();
       nome= "DEFAULT";
    }

    public Missile(String nome) {
        this.nome = nome;
        componenti = new Vector<Componente>();

    }

    public void add(Componente comp){
        componenti.add(comp);
    }

    public double getPesoMissile(){
        double pesoTotale=0;
        for(int k = 0; k< componenti.size(); k++) {
            pesoTotale=pesoTotale+ componenti.get(k).getPeso();
        }
        return pesoTotale;
    }

    private boolean spintaSuff(){
        double spintaTot=0;
        for(Componente c : componenti){
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

        for(Componente c: componenti){
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


    public boolean puoVolare(){
            return spintaSuff() && capacitaTotSuff();
    }



    public String toString() {
        return "Missile{" +
                "nome='" + nome + '\'' +
                ", componeti=" + componenti +
                '}';
    }


}
