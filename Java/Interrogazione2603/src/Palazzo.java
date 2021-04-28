import java.util.Vector;

public class Palazzo {
    public class Piano{
        private Vector<Appartamenti> appartamento;
        private int identificativo;

        public Piano(Vector<Appartamenti> appartamento, int identificativo) {
            this.appartamento = appartamento;
            this.identificativo = identificativo;
        }

        public void add(){}

        public Vector<Appartamenti> getAppartamento() {
            return appartamento;
        }

        public int getIdentificativo() {
            return identificativo;
        }

        public class Appartamenti{
            private Vector<Stanze> stanza;
            private float valore;

            public Appartamenti(Vector<Stanze> stanza, float valore) {
                this.stanza = stanza;
                this.valore = valore;
            }

            public Vector<Stanze> getStanza() {
                return stanza;
            }

            public float getValore() {
                return valore;
            }

            public void add(){}

            public class Stanze{
                private float lunghezza;
                private float larghezza;

                public Stanze(float lunghezza, float larghezza) {
                    this.lunghezza = lunghezza;
                    this.larghezza = larghezza;
                }

                public float getLunghezza() {
                    return lunghezza;
                }

                public float getLarghezza() {
                    return larghezza;
                }
            }
        }
    }

    private int nPiani;
    private Vector<Piano.Appartamenti> appartamenti;

    public Palazzo(int nPiani, Vector<Piano.Appartamenti> appartamenti) {
        this.nPiani = nPiani;
        this.appartamenti = appartamenti;
    }

    public void add(){

    }
}
