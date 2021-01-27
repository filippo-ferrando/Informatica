import java.util.Vector;

public class Componenti extends Missile{
    private float peso;
    private String descrizione;


    public Componenti(String nome, Vector<Componenti> componenti, float peso, String descrizione) {
        super(nome, componenti);
        this.peso = peso;
        this.descrizione = descrizione;
    }

    public float getPeso() {
        return peso;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String toString() {
        return "Componenti{" +
                super.toString() +
                ", peso=" + peso +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
