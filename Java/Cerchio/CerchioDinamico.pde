public class CerchioDinamico extends Cerchio{
  private float speedX;
  private float speedY;
  private final float DEFAULT_VEL = 1;
  
  public CerchioDinamico(){
    super(); //costruttore della superclasse Cerchio()
    speedX = DEFAULT_VEL;
    speedY = DEFAULT_VEL;
  }
  
  public void move(){
    setCordX(getCordX() + speedX);
    setCordY(getCordY() + speedY);
  }
  
  public void setSpeedX(float speedX){
    this.speedX = speedX;
  }
  
  public void setSpeedY(float speedY){
    this.speedY = speedY;
  }
  
  public float getSpeedX(){
    return speedX;
  }
  
  public float getSpeedY(){
    return speedY;
  }
  
  public void show(){
    move();
    super.show();
  }
}
