class CerchioRimbalzo extends CerchioDinamico{
  public CerchioRimbalzo(){
    super();

  }
  
  public void move(){
    if((getCordX() + (getDim() / 2)) >= width){
       setSpeedX(getSpeedX() * -1);
    }
    if((getCordX() - (getDim() / 2)) <= 0){
      setSpeedX(getSpeedX() * -1);
    }
    
    if((getCordY() + (getDim() / 2)) >= height){
       setSpeedY(getSpeedY() * -1);
    }
    if((getCordY() - (getDim() / 2)) <= 0){
      setSpeedY(getSpeedY() * -1);
    } 
    super.move();
  }
  
  public void show(){
    move();
    super.show();
  }
}
