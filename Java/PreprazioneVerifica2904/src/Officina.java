import java.util.Vector;

public class Officina {
    String nome;
    String indirizzo;
    Vector<Riparazione> riparazioni;
    final int NUM_MAX_DIP = 20;
    Operatore[] dipendenti = new Operatore[NUM_MAX_DIP];
    Direttore direttaDa;
    static int kDipendenti = 0;

    public Officina(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    private class Operatore extends Persona{
        int anniServizio;

        public Operatore(String nome, String cognome, String numeroTelefono, int anniServizio) {
            super(nome, cognome, numeroTelefono);
            this.anniServizio = anniServizio;
        }
    }

    public void addDipendente(String nome, String cognome, String numeroTelefono, int anniServizio) throws ValoreMassimoRaggiunto {
        if(kDipendenti <= 20){
            Operatore d = new Operatore(nome, cognome, numeroTelefono, anniServizio);
            dipendenti[kDipendenti] = d;
            kDipendenti++;
        }else{
            throw new ValoreMassimoRaggiunto("Massimo numero di dipendenti raggiunto");
        }
    }

    public void effettuaRiparazione(Riparazione r){
        riparazioni.add(r);
    }

    public void direttaDa(Direttore d){
        this.direttaDa = d;
    }


}
