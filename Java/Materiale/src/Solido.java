public abstract class Solido {
    private double pesoSpecifico ;

    public Solido (double pesoSpecifico){
        this.pesoSpecifico = pesoSpecifico ;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public double getPeso(){
        return pesoSpecifico * getVolume() ;
    }

    public abstract double getSuperficie();

    public abstract double getVolume();


}
