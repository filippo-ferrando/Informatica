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


    public String toString() {
        return "Agenzia{" +
                "nome='" + nome + '\'' +
                ", flotta=" + flotta +
                '}';
    }
}
