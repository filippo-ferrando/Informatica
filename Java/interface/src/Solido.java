public abstract class Solido implements FiguraSolida, CorpoSolido{
    private double pesoSpecifico;

    public Solido(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }
    public double getPeso(){
        return getVolume() * pesoSpecifico;
    }
}
