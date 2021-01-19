public class Cubo extends Solido {
    private double lato ;

    public Cubo(double pesoSpecifico, double lato){
        super(pesoSpecifico);
        this.lato = lato ;
    }

    public double getLato() { return lato; }

    @Override
    public double getSuperficie() { return lato * lato * 6 ; }

    @Override
    public double getVolume() { return lato * lato * lato ; }

    @Override
    public String toString() {
        return "Cubo{" + "\n" + "\t" +
                "Peso Specifico= " + super.getPesoSpecifico() + "\n" + "\t" +
                "Lato= " + getLato() + "\n" + "\t" +
                "Peso= " + super.getPeso() + "\n" + "\t" +
                "Superficie= " + getSuperficie() + "\n" + "\t" +
                "Volume= " + getVolume() + "\n" +
                "\n " + '}';
    }

}

