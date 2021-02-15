import java.util.Vector;

public class Agenzia {
    private String nome;
    private Vector<Missile> flotta;

    public Agenzia(String nome) {
        this.nome = nome;
        flotta= new Vector<Missile>();
    }

    public void add(Missile missil){
        flotta.add(missil);
    }

    public int totMissili(){
        return flotta.size();
    }

    public void trovaMissile(String nome) {
        boolean tro = false;
        boolean vola = false;
        int cnt = 0;

        while(cnt < flotta.size() && tro == false){
            if(nome == flotta.get(cnt).getNome()){
                vola = flotta.get(cnt).puoVolare();

                if(vola == true){
                    System.out.println("Missile trovato");
                    System.out.println("Il missile può volare");
                }else{
                    System.out.println("Missile trovato");
                    System.out.println("Il missile non può volare");
                }
            }
            cnt++;
        }
        if(tro == false) throw new MissileNonPresente();
    }

    public int totMissiliCheVolano() {
        int funzionanti = 0;
        for(int k=0; k<flotta.size(); k++){
            if(flotta.get(k).puoVolare() == true){
                funzionanti += 1;
            }
        }
        return funzionanti;
    }


    @Override
    public String toString() {
        return "Agenzia{" +
                "nome='" + nome + '\'' +
                ", flotta=" + flotta +
                '}';
    }
}
