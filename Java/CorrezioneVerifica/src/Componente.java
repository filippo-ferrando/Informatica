public abstract class Componente {
    private String descizione;
    private double peso;

    public Componente(String descizione, double peso) {
        this.descizione = descizione;
        this.peso = peso;
    }

    public Componente(){
        this.descizione="DEFAULT";
        this.peso= 10;
    }

    public String getDescizione() {
        return descizione;
    }

    public void setDescizione(String descizione) {
        this.descizione = descizione;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws ValoreNonValido{
        if(peso<=0){
            throw new ValoreNonValido("il peso non può essere minore o uguale a 0");
        }else{
            this.peso = peso;
        }

    }


    public String toString() {
        return "Componente{" +
                "descizione='" + descizione + '\'' +
                ", peso=" + peso +
                '}';
    }
}
