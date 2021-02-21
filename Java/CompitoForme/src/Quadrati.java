public class Quadrati extends Figura implements Disegnabile{
    public Quadrati(String nome) {
        super(nome);
    }

    @Override
    public void draw() {
        System.out.println("Quadrato disegnato");
    }

    @Override
    public void erase() {
        System.out.println("Quadrato cancellato");
    }
}
