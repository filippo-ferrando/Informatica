import java.io.*;

public class Tastiera {
    BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

    public String leggiString() {
        String s = null;
        try {
            s = tastiera.readLine();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Errore di input");
        }
        return s;
    }
    public int leggiInt(String msgErrore) {
        int n = 0;
        boolean err;
        do {
            try {
                n = Integer.parseInt(tastiera.readLine());
                err = false;
            } catch (NumberFormatException e) {
                err = true;
                System.out.print(msgErrore);
            } catch (IOException e) {
                err = true;
                System.out.println("Errore di input");
            }
        } while (err == true);
        return n;
    }

    public float leggiFloat(String msgErrore){
        float n=0;
        boolean err;
        do{
            try {
                n=Float.parseFloat(tastiera.readLine());
                err=false;
            }catch (NumberFormatException e){
                err=true;
                System.out.println(msgErrore);
            }
            catch (IOException e) {
                err=true;
                e.printStackTrace();
            }
        }while (err == true);
        return n;
    }
    public double leggiDouble(String msgErrore){
        double n=0;
        boolean err;
        do{
            try {
                n=Double.parseDouble(tastiera.readLine());
                err=false;
            }catch (NumberFormatException e){
                err=true;
                System.out.println(msgErrore);
            }
            catch (IOException e) {
                err=true;
                e.printStackTrace();
            }
        }while (err == true);
        return n;
    }
}
