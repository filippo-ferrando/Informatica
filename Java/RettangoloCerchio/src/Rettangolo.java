public class Rettangolo {
    private float base;
    private float altezza;

    public float getAltezza(){
        return this.altezza;
    }
    public float getBase(){
        return this.base;
    }
    public void setBase(float base){
        if(base>0){
            this.base=base;
        }else{
            this.base=1;
        }
    }
    public void setAltezza(float altezza){
        if(altezza>0){
            this.altezza=altezza;
        }else{
            this.altezza=1;
        }
    }
    public float getArea(){
        return (base*altezza);
    }
    public float getPerimetro(){
        return ((base*2)+(altezza*2));
    }
    public String Quadrato(){
        String quadrato;
        if(altezza==base){
            quadrato="E' un Quadrato";
        }else{
            quadrato="Non e' un Quadrato";
        }
        return quadrato;
    }
    public Rettangolo(){
        altezza=1;
        base=1;
    }
    public Rettangolo(float b,float h){
        altezza=h;
        base=b;
    }
}
