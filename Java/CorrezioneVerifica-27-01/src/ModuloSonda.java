public class ModuloSonda extends Componente{
    private Tipologia tipo;

    public ModuloSonda(String descizione, double peso, Tipologia tipo) {
        super(descizione, peso);
        this.tipo = tipo;
    }

    public ModuloSonda(String ciao) {
        super("SONDA", 10);
        this.tipo = Tipologia.FOTOSENSORI;
    }

    public Tipologia getTipo() {
        return tipo;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }


    public String toString() {
        return "ModuloSonda{" +
                "tipo=" + tipo +
                '}';
    }
}
