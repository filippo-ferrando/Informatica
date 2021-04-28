import javax.sql.rowset.serial.SerialJavaObject;
import java.util.Calendar;
import java.util.Vector;

public class Treno {

    private String nome;
    private Vector<Vagone> vagoni;
    private static int codiceSeriale = 0;

    public Treno(String nome){
        this.nome = nome;
        vagoni = new Vector<Vagone>();
    }

    public abstract class Vagone{
        private int codice;
        private double peso_vuoto;
        private String azienda;
        private int annoProd;

        public Vagone(double peso_vuoto, String azienda, int annoProd) throws ValoreNonValidoException{
            this.codice = codiceSeriale++;

            if (peso_vuoto > 0)
                this.peso_vuoto = peso_vuoto;
            else throw new ValoreNonValidoException("invalid empty weight");

            this.azienda = azienda;
            this.annoProd = annoProd;
        }

        public String toString(){
            return "codice immatricolazione: " + codice + "\npeso a vuoto: " + peso_vuoto +
                    "\nazienda prodruttrice: " + azienda + "\nanno di produzione: " + annoProd + "\n";
        }
    }


    public class VagonePasseggeri extends Vagone{
        private Classi classe;
        private int num_posti;
        private int posti_occupati;

        public VagonePasseggeri(double peso_vuoto, String azienda, int annoProd, Classi classe, int num_posti, int posti_occupati) throws ValoreNonValidoException {
            super(peso_vuoto, azienda, annoProd);
            this.classe = classe;

            if (num_posti > 0)
                this.num_posti = num_posti;
            else throw new ValoreNonValidoException("invalid number of places");
            if (posti_occupati <= num_posti)
                this.posti_occupati = posti_occupati;
            else throw new ValoreNonValidoException("too many occupated places");
        }

        public int getPosti_occupati(){
            return posti_occupati;
        }

        public String toString(){
            return super.toString() + "classe: " + classe + "\nnumero di posti: " + num_posti + "\nposti occupati" +
                    posti_occupati;
        }
    }

    public class VagoneMerci extends Vagone{
        private double volume_carico;
        private double peso_massimo;
        private double peso_effettivo;

        public VagoneMerci(double peso_vuoto, String azienda, int annoProd, double volume_carico, double peso_massimo, double peso_effettivo) throws ValoreNonValidoException {
            super(peso_vuoto, azienda, annoProd);

            if (volume_carico < 0 || peso_massimo < 0 || peso_effettivo < 0)
                throw new ValoreNonValidoException("invalid data");
            else{
                this.volume_carico = volume_carico;
                this.peso_massimo = peso_massimo;
                if (peso_effettivo <= peso_massimo)
                    this.peso_effettivo = peso_effettivo;
                else throw new ValoreNonValidoException("invalid weight");
            }
        }

        public double getPeso_effettivo() {
            return peso_effettivo;
        }

        public String toString(){
            return super.toString() + "volume del carico: " + volume_carico + "\npeso massimo trasportabile:" +
                    peso_massimo + "\npeso effettivo: " + peso_effettivo;
        }
    }


    public void addVagone(double peso_vuoto, String azienda, int annoProd, double volume_carico, double peso_massimo,
                          double peso_effettivo) throws ValoreNonValidoException {
        vagoni.add(new VagoneMerci(peso_vuoto, azienda, annoProd, volume_carico, peso_massimo, peso_effettivo));
    }

    public void add(Vagone v){
        vagoni.add(v);
    }

    public void addVagone(double peso_vuoto, String azienda, int annoProd, Classi classe, int num_posti,
                          int posti_occupati) throws ValoreNonValidoException {
        vagoni.add(new VagonePasseggeri(peso_vuoto, azienda, annoProd, classe, num_posti, posti_occupati));
    }


    public double get_peso_tot(){
        double peso = 0;
        for (Vagone v : vagoni){
            if (v instanceof VagoneMerci)
                peso += ((VagoneMerci)v).getPeso_effettivo();
            else if (v instanceof VagonePasseggeri){
                for (int i = 0; i < ((VagonePasseggeri) v).getPosti_occupati(); i++)
                    peso += 65;
            }
        }
        return peso;
    }

    public String toString(){
        String str = "Nome treno: " + nome + "\n";
        for (Vagone v : vagoni){
            str += v.toString() + "\n";
        }
        return str;
    }
}
