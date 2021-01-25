import java.util.Vector;

public class CompagniaPetrolifera {
    private Vector<SitoEstrazione> siti;
    private String nome;

    public CompagniaPetrolifera(Vector<SitoEstrazione> siti, String nome) {
        this.nome = nome;
        this.siti = siti;
    }

    public void addSito(SitoEstrazione s){
        this.siti.add(s);
    }

    public int getCapacitaTot(){
        int capacitaTot = 0;
        for(SitoEstrazione s: this.siti) capacitaTot += s.getGreggioTotale();

        return capacitaTot;
    }

    @Override
    public String toString() {
        return "CompagniaPetrolifera{" +
                "nomeCompagnia= " + this.nome +
                "siti=" + siti +
                '}';
    }
}
