import java.util.Vector;

public class Moduli extends Componenti{
    private enumModuli modulo;

    public Moduli(String nome, Vector<Componenti> componenti, float peso, String descrizione, enumModuli modulo) {
        super(nome, componenti, peso, descrizione);
        this.modulo = modulo;
    }

    public enumModuli getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return "Moduli{" +
                super.toString() +
                ", modulo=" + modulo +
                '}';
    }
}
