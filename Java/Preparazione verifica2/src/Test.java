import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<CompagniaPetrolifera> compagnie = new Vector<>();

        CompagniaPetrolifera c1 = new CompagniaPetrolifera(new Vector<SitoEstrazione>(), "Panos Inc.");
        CompagniaPetrolifera c2 = new CompagniaPetrolifera(new Vector<SitoEstrazione>(), "Vigus SPA.");

        SitoEstrazione s1c1 = new SitoEstrazione("Sito 1", "Russia", new Vector<Pozzo>());
        SitoEstrazione s2c1 = new SitoEstrazione("Sito 2", "Norvegia", new Vector<Pozzo>());
        SitoEstrazione s3c1 = new SitoEstrazione("Sito 3", "Lettonia", new Vector<Pozzo>());

        SitoEstrazione s1c2 = new SitoEstrazione("Sito 1", "Albania", new Vector<Pozzo>());
        SitoEstrazione s2c2 = new SitoEstrazione("Sito 2", "Monte Negro", new Vector<Pozzo>());
        SitoEstrazione s3c2 = new SitoEstrazione("Sito 3", "Casa di Jerry", new Vector<Pozzo>());

        for(int i = 0; i < 3; i++) s1c1.addPozzo(new PozzoMarino(true, 12343, 6000));

        for(int i = 0; i < 3; i++) s2c1.addPozzo(new PozzoMarino(true, 127490, 3070));

        for(int i = 0; i < 3; i++) s3c1.addPozzo(new PozzoMarino(true, 67953, 4574));

        for(int i = 0; i < 3; i++) s1c2.addPozzo(new PozzoTerrestre(true, 12343, tipoTerreno.ROCCIOSO));

        for(int i = 0; i < 3; i++) s2c2.addPozzo(new PozzoTerrestre(true, 127490, tipoTerreno.GHIAIOSO));

        for(int i = 0; i < 3; i++) s3c2.addPozzo(new PozzoTerrestre(true, 67953, tipoTerreno.SABBIOSO));

        PozzoMarino p1 = null;

        try{
            p1 = new PozzoMarino(true, 23234, 23452);
        }catch(ValoreNonValidoExcept e){
            System.out.println(e.getMessage());
        }

        c1.addSito(s1c1);
        c1.addSito(s2c1);
        c1.addSito(s3c1);

        c2.addSito(s1c2);
        c2.addSito(s2c2);
        c2.addSito(s3c2);

        compagnie.add(c1);
        compagnie.add(c2);

        int max = 0;
        CompagniaPetrolifera cMax = null;

        for(CompagniaPetrolifera c : compagnie){
            if(c.getCapacitaTot() > max){
                cMax = c;
            }
        }

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("\n");

        System.out.println(cMax);

        s1c1.disattivaPozzo(0);

        System.out.println("\n");
        System.out.println(c1);

        s1c1.attivaPozzo(0);

        System.out.println("\n");
        System.out.println(c1);

    }
}
