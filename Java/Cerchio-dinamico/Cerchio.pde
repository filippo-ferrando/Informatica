public class Cerchio{
  private float dim;
  private final float DIM_MIN = 10;
  private float cordX;
  private float cordY;
  private color colore;
  private color bordo;
  
  public Cerchio(){
    dim = DIM_MIN;
    cordX = width / 2;
    cordY = height / 2;
    colore = color(255, 255, 255);  //bianco
    bordo = color(0,0,0);         //nero
  }
  
  public void setDim(float dim){
    if (dim >= DIM_MIN){
      this.dim = dim;
    }else{
      this.dim = DIM_MIN;
    }
  }
    
  public float getDim(){
    return dim; 
  }
  
  public float getDimMin(){
    return DIM_MIN; 
  }
  
  public void setCordX(float x){
    cordX = x; 
  }
  
  public void setCordY(float y){
    cordY = y; 
  }
  
  public float getCordX(){ 
    return cordX; 
  }
  
  public float getCordY(){ 
    return cordY; 
  }
  
  public void setColore(color colore){
    this.colore = color(colore); 
  }
  
  public color getColore(){ 
    return colore;
  }
  
  public color getBordo(){
    return bordo; 
  }
  
  public void setBordo(color colore){
    bordo = colore;
  }
  
  public void show(){
    strokeWeight(3);  //spessore
    stroke(bordo);  //colore bordo
    fill(colore);  //colore di riempimento
    circle(cordX, cordY, dim);   //centro X,Y e diametro dim
  }  
}
