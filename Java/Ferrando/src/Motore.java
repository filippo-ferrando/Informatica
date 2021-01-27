import java.util.Vector;

public class Motore extends Componenti{
    private float spinta;
    private float consumoLitri;


    public Motore(String nome, Vector<Componenti> componenti, float peso, String descrizione, float spinta, float consumoLitri) throws ValoreNonValido{
        super(nome, componenti, peso, descrizione);
        if(spinta < 0) {
            throw new ValoreNonValido("Spinta non valida");
        }else{
            this.spinta = spinta;
        }

        if(consumoLitri < 0) {
            throw new ValoreNonValido("Consumo non valida");
        }else{
            this.consumoLitri = consumoLitri;
        }
    }

    public float getSpinta() {
        return spinta;
    }

    public float getConsumoLitri() {
        return consumoLitri;
    }

    @Override
    public String toString() {
        return "Motore{" +
                super.toString() +
                ", spinta=" + spinta +
                ", consumoLitri=" + consumoLitri +
                '}';
    }
}
