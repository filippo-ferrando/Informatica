import java.util.Vector;

public class Agenzia {
    private String nome;
    private Vector<Missile> missili;

    public Agenzia(String nome, Vector<Missile> missili) {
        this.nome = nome;
        this.missili = missili;
    }

    public void addMissile(Missile m){
        missili.add(m);
    }

    public void trovaMissile(int Codice) throws MissileNonPresente{
        boolean tro = false;
        int cnt = 0;
        while(cnt < missili.size() && tro == false){
            if(Codice == missili.get(cnt).getCodice()){
                System.out.println(missili.get(cnt));
                tro = true;
            }
            cnt++;
        }
        if(tro == false) throw new MissileNonPresente();
    }

    @Override
    public String toString() {
        return "Agenzia{" +
                "nome='" + nome + '\'' +
                ", missili=" + missili +
                '}';
    }
}
