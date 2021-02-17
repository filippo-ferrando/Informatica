public class Cubo extends Solido{
    private double lato;

    public Cubo(double pesoSpecifico, double lato) {
        super(pesoSpecifico);
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public double getVolume(){
        return this.lato * this.lato * this.lato;
    }

    public double getSuperficie(){
        return (this.lato * this.lato) * 4;
    }
}
