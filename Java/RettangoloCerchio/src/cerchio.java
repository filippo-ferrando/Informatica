public class cerchio {
    private float raggio;

    public float getRaggio(){
        return this.raggio;
    }
    public void setRaggio(float raggio){
        this.raggio=raggio;
    }
    public float getArea(){
        return (raggio*raggio)*(float)3.14;
    }
    public float getCirconferenza(){
        return raggio*(float)3.14*2;
    }
    public cerchio(){
        this.raggio=0;
    }
    public cerchio(float raggio){
        this.raggio=raggio;
    }
}
