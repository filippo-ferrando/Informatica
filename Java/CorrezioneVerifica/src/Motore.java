public class Motore extends Componente{
    private double spinta;
    private double consumoOrario;

    public Motore(String descizione, double peso, double spinta, double consumoOrario) throws ValoreNonValido{
        super(descizione, peso);
        if(spinta<=0){
            throw new ValoreNonValido("la spinta non può essere negativa");
        }else{
            this.spinta = spinta;
        }
        if (consumoOrario<=0){
            throw new ValoreNonValido("il consumo non può essere negativo");
        }else{
            this.consumoOrario = consumoOrario;
        }
    }

    public Motore(){
        super("MOTORE", 10);
        this.spinta = 10;
        this.consumoOrario = 20;
    }

    public double getSpinta() {
        return spinta;
    }

    public void setSpinta(double spinta) throws ValoreNonValido{
        if(spinta<=0){
            throw new ValoreNonValido("la spinta non può essere negativa");
        }else{
            this.spinta = spinta;
        }
    }

    public double getConsumoOrario() {
        return consumoOrario;
    }

    public void setConsumoOrario(double consumoOrario) throws ValoreNonValido{
        if (consumoOrario<=0){
            throw new ValoreNonValido("il consumo non può essere negativo");
        }else{
            this.consumoOrario = consumoOrario;
        }
    }

    public String toString() {
        return "Motore{" +
                "spinta=" + spinta +
                ", consumoOrario=" + consumoOrario +
                '}';
    }
}
