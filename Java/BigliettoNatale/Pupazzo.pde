public class Pupazzo{
  private int xCerchio1 = 200;
  
  public Pupazzo(){
    this.xCerchio1 = 80;
  }
  
  public void creaPupazzo(){
    ellipse(xCerchio1, 300, 150, 150);
    ellipse(xCerchio1, 200, 100, 100);
    ellipse(xCerchio1, 140, 60, 60);
    
    fill(0,0,0);
    ellipse(64, 132, 10, 10);
    ellipse(96, 132, 10, 10);
    
    fill(255,69,0);
    triangle(85, 145, 80, 155, 75, 145);
    
    fill(255,0,0);
    triangle(50, 115, 80, 60, 110, 115); 
  }
}
