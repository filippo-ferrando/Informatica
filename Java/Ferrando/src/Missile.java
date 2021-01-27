import java.util.Vector;

public class Missile {
    private String nome;
    private int codice;
    private Vector<Componenti> componenti;

    public Missile(String nome, Vector<Componenti> componenti) {
        this.nome = nome;
        this.codice = GeneraCodice.creaCodici();
        this.componenti = componenti;
    }

    public String getNome() {
        return nome;
    }

    public int getCodice() {
        return codice;
    }

    public float totPeso(){
        float totPeso = 0;

        for(Componenti c: componenti){
            totPeso += c.getPeso();
        }

        return totPeso;
    }

    public float totLitri(){
        float totLitri = 0;
        for(int k=0; k<componenti.size(); k++){
            if(componenti.get(k) instanceof Serbatoio){
                totLitri += ((Serbatoio) componenti.get(k)).getCapacita();
            }
        }
        return totLitri;
    }

    public float totSpinta(){
        float totSpinta = 0;
        for(int k=0; k<componenti.size(); k++){
            if(componenti.get(k) instanceof Motore){
                totSpinta += ((Motore) componenti.get(k)).getSpinta();
            }
        }
        return totSpinta;
    }

    public float totConsumoLitri(){
        float totConsumo = 0;
        for(int k=0; k<componenti.size(); k++){
            if(componenti.get(k) instanceof Motore){
                totConsumo += ((Motore) componenti.get(k)).getConsumoLitri();
            }
        }
        return totConsumo;
    }

    public boolean volaPerUnOra() {
        boolean controlloPeso = false;
        boolean controlloVolo = false;

        if (totPeso() < totSpinta()) {
            controlloPeso = true;
        }

        if (totLitri() > totConsumoLitri()) {
            controlloVolo = true;
        }
        System.out.println("la spinta del motore basta per sollevare l'aereo: ");
        System.out.println(controlloPeso);

        System.out.println("il carburante basta per un ora: ");
        System.out.println(controlloVolo);

        if (controlloPeso == true && controlloVolo == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Missile{" +
                "nome='" + nome + '\'' +
                ", codice=" + codice +
                ", componenti=" + componenti +
                '}';
    }
}
