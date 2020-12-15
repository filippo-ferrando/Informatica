public class Triangolo{
  private color colore;
  private color bordo;
  private float x1;
  private float x2;
  private float x3;
  private float y1;
  private float y2;
  private float y3;
  private final float DEFAULT = 10;
  
  public Triangolo(){
    x1 = 0;
    x2 = 0;
    x3 = 0;
    y1 = 0;
    y2 = 0;
    y3 = 0;
    colore = color(255, 255, 255);  //new color
    bordo = color(0, 0, 0);
  }
  
  public void setX1(float x1){
    this.x1 = x1;      
  }
  
   public void setX2(float x2){
    this.x2 = x2;      
  }
  
   public void setX3(float x3){
    this.x3 = x3;      
  }
  
   public void setY1(float y1){
    this.y1 = y1;      
  }
  
   public void setY2(float y2){
    this.y2 = y2;      
  }
  
   public void setY3(float y3){
    this.y3 = y3;      
  }
  
  public float getX1(){ return x1; }
  public float getX2(){ return x2; }
  public float getX3(){ return x3; }
  public float getY1(){ return y1; }
  public float getY2(){ return y2; }
  public float getY3(){ return y3; }
  
  
  
  public void setColore(color colore){
    this.colore = color(colore); 
  }  
  
  public color getColore(){ return colore;}  
  
  public color getBordo(){  return bordo; }
  
  public void setBordo(color colore){bordo = colore;}
  
  public void show(){
     strokeWeight(3);  //spessore
     stroke(bordo);  //colore bordo
     fill(colore);  //colore di riempimento
     triangle(x1, y1, x2, y2, x3, y3);  //centro X,Y e diametro dim
  }
}
