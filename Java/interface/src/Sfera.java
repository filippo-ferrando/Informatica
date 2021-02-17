import java.math.*;

import static java.lang.Math.pow;

public class Sfera extends Solido{
    private double raggio;

    public Sfera(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double getVolume(){
        return (4 * (Math.PI * pow(getRaggio(),3)))/3;
    }

    public double getSuperficie(){
        return pow(getRaggio(),2) * (4 * Math.PI);
    }
}
