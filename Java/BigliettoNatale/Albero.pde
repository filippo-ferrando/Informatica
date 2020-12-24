public class Albero{
  private Triangolo t1 = new Triangolo();  //dichiarazione dei 3 triangoli dell'albero
  private Triangolo t2 = new Triangolo();
  private Triangolo t3 = new Triangolo();
  private Rettangolo tronco = new Rettangolo();  //tronco dell'albero
  private float x = 0, y = 0; //coordinate per spostare l'albero
  
  public Albero(float x, float y){
    this.x = x; //assegno le coordinate passate al costruttore
    this.y = y;
    
    t1.setX1(x-100); //creo i 3 triangoli relativamente alla x e alla y passate
    t1.setX2(x);
    t1.setX3(x+100);
    t1.setY1(y+225);
    t1.setY2(y);
    t1.setY3(y+225);
    t1.setColore(color(1,50,32));
    
    t2.setX1(x-100);
    t2.setX2(x);
    t2.setX3(x+100);
    t2.setY1(y+190);
    t2.setY2(y);
    t2.setY3(y+190);
    t2.setColore(color(1,50,32));
    
    t3.setX1(x-100);
    t3.setX2(x);
    t3.setX3(x+100);
    t3.setY1(y+140);
    t3.setY2(y);
    t3.setY3(y+140);
    t3.setColore(color(1,50,32));
    
    tronco.setX(x-10);
    tronco.setY(y+225);
    tronco.setAltezza(55);
    tronco.setLarghezza(25);
    tronco.setColore(color(101,67,33));
    
  }
  
  public void show(){
    tronco.show();
    t1.show();
    t2.show();
    t3.show();
  }
}
