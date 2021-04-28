import java.util.Vector;

public class Treno {
    private String nome;
    private Vector<Vagone> vagoni;
    private float pesoMotrice;
    private static int codiceBase = 0;

    public enum Classi {
        A,
        B,
        C,
    }

    public abstract class Vagone{
        private int codice;
        private float pesoAVuoto;
        private String aziendaCostruttrice;
        private int annoCostruzione;

        public Vagone(float pesoAVuoto, String aziendaCostruttrice, int annoCostruzione) throws ValoreNonValidoExcept {
            this.codice = codiceBase++;
            if (pesoAVuoto > 0)
                this.pesoAVuoto = pesoAVuoto;
            else throw new ValoreNonValidoExcept("peso non valido");

            this.aziendaCostruttrice = aziendaCostruttrice;
            this.annoCostruzione = annoCostruzione;
        }

        public int getCodice() {
            return codice;
        }

        public float getPesoAVuoto() {
            return pesoAVuoto;
        }

        public abstract float getPesoComplessivo();

        public String getAziendaCostruttrice() {
            return aziendaCostruttrice;
        }

        public int getAnnoCostruzione() {
            return annoCostruzione;
        }

        @Override
        public String toString() {
            return "codice=" + codice +
                    ", pesoAVuoto=" + pesoAVuoto +
                    ", aziendaCostruttrice='" + aziendaCostruttrice + '\'' +
                    ", annoCostruzione=" + annoCostruzione + "\n";
        }
    }

    public class VagonePasseggeri extends Vagone{
        private Classi classe;
        private int postiDisponibili;
        private int postiOccupati;
        private float PESO_PERSONA=70f;

        public VagonePasseggeri(float pesoAVuoto, String aziendaCostruttrice, int annoCostruzione, Classi classe, int postiDisponibili, int postiOccupati) throws ValoreNonValidoExcept {
            super(pesoAVuoto, aziendaCostruttrice, annoCostruzione);
            this.classe = classe;
            if (postiDisponibili > 0)
                this.postiDisponibili = postiDisponibili;
            else throw new ValoreNonValidoExcept("Numero posti non valido");

            if (postiOccupati <= postiDisponibili)
                this.postiOccupati = postiOccupati;
            else throw new ValoreNonValidoExcept("Troppi posti occupati");
        }

        public Classi getClasse() {
            return classe;
        }

        public int getPostiDisponibili() {
            return postiDisponibili;
        }

        public int getPostiOccupati() {
            return postiOccupati;
        }

        public float getPESO_PERSONA() {
            return PESO_PERSONA;
        }

        public float getPesoComplessivo(){
            return (PESO_PERSONA*postiOccupati)+super.getPesoAVuoto();
        }

        public void setPESO_PERSONA(float PESO_PERSONA) {
            this.PESO_PERSONA = PESO_PERSONA;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "classe='" + classe + '\'' +
                    ", postiDisponibili=" + postiDisponibili +
                    ", postiOccupati=" + postiOccupati +
                    ", PESO_PERSONA=" + PESO_PERSONA;
        }
    }

    public class VagoneMerci extends Vagone{
        private float volumeCarico;
        private float pesoMassimoCarico;
        private float pesoEffettivoCarico;

        public VagoneMerci(float pesoAVuoto, String aziendaCostruttrice, int annoCostruzione, float volumeCarico, float pesoMassimoCarico, float pesoEffettivoCarico) throws ValoreNonValidoExcept {
            super(pesoAVuoto, aziendaCostruttrice, annoCostruzione);

            if (volumeCarico < 0 || pesoMassimoCarico < 0 || pesoEffettivoCarico < 0)
                throw new ValoreNonValidoExcept("Dati non validi");
            else {
                this.volumeCarico = volumeCarico;
                this.pesoMassimoCarico = pesoMassimoCarico;
                if (pesoEffettivoCarico <= pesoMassimoCarico)
                    this.pesoEffettivoCarico = pesoEffettivoCarico;
                else throw new ValoreNonValidoExcept("Peso non valido");
            }
        }

        public float getVolumeCarico() {
            return volumeCarico;
        }

        public float getPesoMassimoCarico() {
            return pesoMassimoCarico;
        }

        public float getPesoEffettivoCarico() {
            return pesoEffettivoCarico;
        }

        public float getPesoComplessivo(){
            return pesoEffettivoCarico+super.getPesoAVuoto();
        }

        @Override
        public String toString() {
            return super.toString() +
                    "volumeCarico=" + volumeCarico +
                    ", pesoMassimoCarico=" + pesoMassimoCarico +
                    ", pesoEffettivoCarico=" + pesoEffettivoCarico;
        }
    }

    public Treno(String nome, float pesoMotrice) {
        this.nome = nome;
        this.vagoni = new Vector<Vagone>();
        this.pesoMotrice = pesoMotrice;
    }

    public void addVagonePasseggeri(float pesoAVuoto, String aziendaCostruttrice, int annoCostruzione, Classi classe, int postiDisponibili, int postiOccupati) throws ValoreNonValidoExcept {
        VagonePasseggeri v = new VagonePasseggeri(pesoAVuoto, aziendaCostruttrice, annoCostruzione,classe, postiDisponibili, postiOccupati);
        vagoni.add(v);
    }

    public void addVagoneMerci(float pesoAVuoto, String aziendaCostruttrice, int annoCostruzione, float volumeCarico, float pesoMassimoCarico, float pesoEffettivoCarico) throws ValoreNonValidoExcept {
        VagoneMerci v = new VagoneMerci(pesoAVuoto, aziendaCostruttrice, annoCostruzione,volumeCarico, pesoMassimoCarico, pesoEffettivoCarico);
        vagoni.add(v);
    }

    public void remove(int codice){
        int k=0;
        boolean tro=false;
        while(k<vagoni.size() && !tro){
            if(vagoni.get(k).getCodice()==codice){
                vagoni.remove(k);
                tro=true;
            }
            k++;
        }
    }

    public String getNome() {
        return nome;
    }

    public float getPesoComplessivoTreno(){
        float som=0;
        for(Vagone v : vagoni){
            som+=v.getPesoComplessivo();
        }
        return som;
    }

    public float getPesoSenzaMotrice(){
        return this.getPesoComplessivoTreno()-pesoMotrice;
    }

    @Override
    public String toString() {
        return "Treno{" +
                "nome='" + nome + '\'' +
                ", vagoni=" + vagoni +
                ", pesoMotrice=" + pesoMotrice +
                '}';
    }
}
