import java.util.Vector;

public class Vettore {
    private Vector<Float> vet;

    public Vettore(int n){
        vet = new Vector<Float>(n);

    }

    public int getDim(){ return vet.size(); }

    public float getSomma(){
        float sum = 0f;
        for(int k=0; k<vet.size() ; k++){
            sum = sum + vet.get(k);
        }
        return sum;
    }

    public float get(int k){
        if(k > 0 && k < vet.size())
            return vet.get(k);
        else
            throw new ArrayIndexOutOfBoundsException("indice fuori vettore");
    }

    public boolean equals(Vettore v){
        boolean ok = true;
        if(vet.size() == v.getDim()){
            int k=0;
            while(k<vet.size() && ok){
                if(vet.get(k)==v.get(k))
                    k++;
                else
                    ok=false;
            }
            return ok;
        }else{
            ok=false;
            return ok;
        }
    }


    @Override
    public String toString() {
        String s = "";
        for (Float x : vet){
            s = s + x.toString() + "";
        }
        return s;
    }
}
