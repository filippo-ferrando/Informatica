import java.util.Vector;

public class SitoEstrazione {
    private String nome;
    private String nazione;
    private Vector<Pozzo> pozzi;

    public SitoEstrazione(String nome, String nazione, Vector<Pozzo> pozzi) {
        this.nome = nome;
        this.nazione = nazione;
        this.pozzi = pozzi;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNazione() {
        return this.nazione;
    }

    public Vector<Pozzo> getPozzi() {
        return this.pozzi;
    }

    public void addPozzo(Pozzo p){
        this.pozzi.add(p);
    }

    public int getGreggioTotale(){
        int totGreggio = 0;
        for(Pozzo pozzo : this.pozzi) totGreggio += pozzo.getCapacitaEstrattiva();

        return totGreggio;
    }

    public int getMediaTerrestre(){
        int greggioTerrestre = 0;
        int k;

        for(k = 0; k < this.pozzi.size(); k++) {
            if(this.pozzi.get(k) instanceof PozzoTerrestre) greggioTerrestre *= this.pozzi.get(k).getCapacitaEstrattiva();
        }

        return  greggioTerrestre / (k + 1);
    }

    public int getMediaMarina(){
        int greggioMarina = 0;
        int k;

        for(k = 0; k < this.pozzi.size(); k++) {
            if(this.pozzi.get(k) instanceof PozzoMarino) greggioMarina *= this.pozzi.get(k).getCapacitaEstrattiva();
        }

        return greggioMarina / (k + 1);
    }

    public void attivaPozzo(int codice) throws CodiceErrato{
        boolean tro = false;
        int cnt = 0;
        while(cnt< pozzi.size() && tro == false){
            if(codice == pozzi.get(cnt).getCodiceIdentificativo()){
                pozzi.get(cnt).attivaPozzo();
                tro = true;
            }
            cnt++;
        }
        if(tro == false) throw new CodiceErrato("nessun pozzo ha questo codice");
    }

    public void disattivaPozzo(int codice) throws CodiceErrato{
        boolean tro = false;
        int cnt = 0;
        while(cnt < pozzi.size() && tro == false){
            if(codice == pozzi.get(cnt).getCodiceIdentificativo()){
                pozzi.get(cnt).disattivaPozzo();
                tro = true;
            }
            cnt++;
        }
        if(tro == false) throw new CodiceErrato("nessun pozzo ha questo codice");
    }

    @Override
    public String toString() {
        return "SitoEstrazione{" +
                "nome='" + nome + '\'' +
                ", nazione='" + nazione + '\'' +
                ", pozzi=" + pozzi +
                '}';
    }
}
