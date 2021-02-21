public class SerbatoioCarburante extends Componente{

    private double capacita;

    public SerbatoioCarburante(String descizione, double peso, double capacita)throws ValoreNonValido {
        super(descizione, peso);
        if(capacita<=0){
            throw new ValoreNonValido("la capacità non può essere minore o uguale a 0");
        }else{
            this.capacita = capacita;
        }
    }

    public SerbatoioCarburante(String serbatoio1) {
        super("SERBATOIO", 10);
        this.capacita = 20;
    }

    public double getCapacita() {
        return capacita;
    }

    public void setCapacita(double capacita) throws ValoreNonValido{
        if(capacita<=0){
            throw new ValoreNonValido("la capacità non può essere minore o uguale a 0");
        }else{
            this.capacita = capacita;
        }

    }


    public String toString() {
        return "SerbatoioCarburante{" +
                "capacita=" + capacita +
                '}';
    }
}
