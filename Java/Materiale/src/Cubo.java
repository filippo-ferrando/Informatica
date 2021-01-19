public class Cubo extends Solido {
    private double lato ;

    public Cubo(double pesoSpecifico, double lato){
        super(pesoSpecifico);
        this.lato = lato ;
    }

    public double getLato() {
        return lato;
    }

    @Override
    public double getSuperficie() {
        return lato * lato * 6 ;
    }

    @Override
    public double getVolume() {
        return lato * lato * lato ;
    }
}
