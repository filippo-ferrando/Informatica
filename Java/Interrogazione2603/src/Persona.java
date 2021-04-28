import java.util.Vector;

public class Persona {
    private Vector<Palazzo.Piano.Appartamenti> appartamento;

    public Persona(Vector<Palazzo.Piano.Appartamenti> appartamento) {
        this.appartamento = appartamento;
    }

    public float calcolaRicchezza(){
        float somma = 0f;

        for (Palazzo.Piano.Appartamenti b: appartamento){
            somma += b.getValore();
        }
        return somma;
    }
}
