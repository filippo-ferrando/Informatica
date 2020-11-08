public class velocita{
    private float kmh;

    public void setKmh(float kmh){
        this.kmh=kmh;
    }

    public float getKmh(){
        return this.kmh;
    }

    public float getMs(){
        return this.kmh/(float)3.6;
    }
    public void setMs(float ms){
        this.kmh = ms * (float)3.6;
    }
    public velocita(){
        kmh=0;
    }
}
