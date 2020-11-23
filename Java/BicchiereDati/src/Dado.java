public class Dado {
    private int nFacce = 0;
    private int val = 0;

    public Dado(){
        nFacce = 6;
        val = 1;
    }

    public Dado(int facce){
        this.nFacce = facce;
        val = 1;
    }

    public int getLancio(){
        val = (int) (Math.random() * nFacce) + 1;
        return val;
    }

    public String toString(){
        return "" + nFacce + "[" + val + "]";
    }
}