public class Rettangolo{
  private color colore;
  private color bordo;
  private float cordX;
  private float cordY;
  private int altezza;
  private int larghezza;
  
  public Rettangolo(){
    cordX = 0;
    cordY = 0;
    altezza = 0;
    larghezza = 0;
    colore = color(255,255,255);
    bordo = color(0,0,0);
  }
  
  public void setX(float x){
    this.cordX = x;
  }
  
  public void setY(float y){
    this.cordY = y;
  }
  
  public void setAltezza(int altezza){
    this.altezza = altezza;
  }
  
  public void setLarghezza(int larghezza){
    this.larghezza = larghezza;
  }
  
  public void setColore(color colore){
    this.colore = color(colore); 
  }  
  
  public void setBordo(color colore){
    bordo = colore;
  }
  
  public float getX(){return cordX;}
  public float getY(){return cordY;}
  public int getAltezza(){return altezza;}
  public int getLarghezza(){return larghezza;}
  public color getColore(){ return colore;}  
  public color getBordo(){  return bordo; }
  
  public void show(){
     strokeWeight(3);  //spessore
     stroke(bordo);  //colore bordo
     fill(colore);  //colore di riempimento
     rect(cordX, cordY, larghezza, altezza);  //centro X,Y e diametro dim
  }  
}
