/*
Dichiarare una classe di nome “temperatura” che ha come attributo la temperatura in gradi centigradi (temp e i
metodi getGradiC e setGradiC). Definire un costruttore per inizializzare la temperatura, e un metodo (getGradiF)
per convertire la temperatura da gradi centigradi a Fahrenheit, sapendo che: F = 32 + ( 9 * C / 5)
*/
public class Temperatura {
    private float tempC;

    public float getGradiC(){
        return tempC;
    }
    public void setGradiC(float tempC){
        this.tempC=tempC;
    }
    public float getGradiF(){
        return 32 + (9 * this.tempC / 5);
    }
    public String toString(){
        return "Gradi: " + this.tempC;
    }
    public Temperatura(){
        this.tempC = 0;
    }
    public Temperatura(float tempC){
        this.tempC = tempC;
    }
}