import java.util.Vector;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Azienda azienda = new Azienda(new Vector<ParcoMacchine>());

        ParcoMacchine pRossi = new ParcoMacchine("Rossi", new Vector<Auto>());

        ParcoMacchine pVerdi = new ParcoMacchine("Verdi", new Vector<Auto>());

        pRossi.add(new Elettrica(Colori.BIANCO, "aa000", 0, 500));
        pRossi.add(new Elettrica(Colori.NERO, "aa001", 0, 200));
        pRossi.add(new Diesel(Colori.GRIGIO, "aa002", 0, 0.07f)); //210
        pRossi.add(new Diesel(Colori.NERO, "aa003", 0, 0.05f)); //350

        pVerdi.add(new Elettrica(Colori.GRIGIO, "ab000", 0, 700));
        pVerdi.add(new Elettrica(Colori.NERO, "ab001", 0, 600));
        pVerdi.add(new Diesel(Colori.GRIGIO, "ab002", 0, 0.04f));
        pVerdi.add(new Diesel(Colori.BIANCO, "ab003", 0, 0.04f));

        azienda.add(pRossi);
        azienda.add(pVerdi);



        for(ParcoMacchine p: azienda.getParcoMacchine()){
            for(Auto a: p.getFiliale()){
                a.setKmPercorsi((float)5000);
            }
        }

        for(ParcoMacchine p: azienda.getParcoMacchine()) System.out.println(p.toString());


        try {
            System.out.println(azienda.datiAuto("aa000", "Rossi"));
        } catch (AutoNonPresenteExcept autoNonPresenteExcept) {
            autoNonPresenteExcept.printStackTrace();
        }


    }
}
