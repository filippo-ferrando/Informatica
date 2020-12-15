public class Albero{
  private Triangolo t1 = new Triangolo();
  private Triangolo t2 = new Triangolo();
  private Triangolo t3 = new Triangolo();
  private float x = 0, y = 0;
  
  public Albero(float x, float y){
    this.x = x;
    this.y = y;
    
    t1.setX1(x-100);
    t1.setX2(x);
    t1.setX3(x+100);
    t1.setY1(y+225);
    t1.setY2(y);
    t1.setY3(y+225);
    t1.setColore(color(101,67,33));
    
    t2.setX1(x-100);
    t2.setX2(x);
    t2.setX3(x+100);
    t2.setY1(y+190);
    t2.setY2(y);
    t2.setY3(y+190);
    t2.setColore(color(101,67,33));
    
    t3.setX1(x-100);
    t3.setX2(x);
    t3.setX3(x+100);
    t3.setY1(y+140);
    t3.setY2(y);
    t3.setY3(y+140);
    t3.setColore(color(101,67,33));
    
  }
  
  public void show(){
    t1.show();
    t2.show();
    t3.show();
  }
  
  
  /*
  public void creaAlbero(){
    fill(101,67,33);
    rect(600,300,25,50);
    
    fill(1,50,32);
    triangle(507, 300, 607, 75, 707, 300); 
    triangle(507, 250, 607, 60, 707, 250);
    triangle(507, 200, 607, 40, 707, 200);
  }
  */
}
