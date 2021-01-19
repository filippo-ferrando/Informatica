public class Sfera extends Solido{
    private double raggio ;

    public Sfera (double pesoSpecifico, double raggio){
        super(pesoSpecifico);
        this.raggio = raggio ;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public double getSuperficie() {
        return 4 * 3.14 * raggio * raggio ;
    }

    @Override
    public double getVolume() {
        return (4 * 3.14 * raggio * raggio * raggio) / 3 ;
    }
}
