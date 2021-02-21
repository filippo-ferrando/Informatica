public class Cerchio extends Figura implements Disegnabile{

    public Cerchio(String nome) {
        super(nome);
    }

    @Override
    public void draw() {
        System.out.println("Cerchio disegnato");
    }

    @Override
    public void erase() {
        System.out.println("Cerchio cancellato");
    }
}
