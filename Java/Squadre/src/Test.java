import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        Squadra s = new Squadra("borgo san giuseppe");

        String nome = null;
        int eta;
        float punteggio;
        System.out.println("inserisci il nome del giocatore: ");
        try {
            nome = b.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("inserisci l'eta del giocatore: ");
        try {
            eta = Integer.parseInt(b.readLine());
        } catch (IOException e) {
            System.out.println("problemi di input");
            eta = 0;
        } catch (NumberFormatException e){
            System.out.println("non hai inserito un intero");
            eta = 0;
            e.printStackTrace();
        }
        System.out.println("inserisci il punteggio del giocatore: ");
        try {
            punteggio = Float.parseFloat(b.readLine());
        } catch (IOException e) {
            System.out.println("problemi di input");
            punteggio = 0;
        } catch (NumberFormatException e){
            System.out.println("non hai inserito un reale");
            punteggio = 0;
        }

        Giocatore g = new Giocatore(nome,eta,punteggio);
        s.addGiocatore(g);

        System.out.println(s.toString());


    }

}