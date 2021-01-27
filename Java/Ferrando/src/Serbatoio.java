import java.util.Vector;

public class Serbatoio extends Componenti{
    private float capacita;

    public Serbatoio(String nome, Vector<Componenti> componenti, float peso, String descrizione, float capacita) throws ValoreNonValido{
        super(nome, componenti, peso, descrizione);
        if(capacita < 0) {
            throw new ValoreNonValido("Capacità non valida");
        }else{
            this.capacita = capacita;
        }
    }

    public float getCapacita() {
        return capacita;
    }

    @Override
    public String toString() {
        return "Serbatoio{" +
                super.toString() +
                ", capacita=" + capacita +
                '}';
    }
}
