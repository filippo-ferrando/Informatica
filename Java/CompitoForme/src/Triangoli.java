public class Triangoli extends Figura implements Disegnabile{
    public Triangoli(String nome) {
        super(nome);
    }

    @Override
    public void draw() {
        System.out.println("Triangolo disegnato");
    }

    @Override
    public void erase() {
        System.out.println("Triangolo cancellato");
    }
}
/*
Creare una nuova classe RandomShapeGenerator che mediante un metodo next() ritorni in modo random un’istanza di Circle,
Square o Triangolo. double x = Math.random();
// valore compreso [0..1) double x = Math.random() * 10; // valore compreso [0..10)
 */