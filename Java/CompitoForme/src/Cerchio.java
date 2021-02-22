public class Cerchio implements Figura {
    private double raggio;
    private static final double DEFAULT_R = 1;

    public Cerchio(Double raggio) {
        if(raggio >= 0){
            this.raggio = raggio;
        }else{
            this.raggio = DEFAULT_R;
        }
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
