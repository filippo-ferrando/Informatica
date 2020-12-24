public class Pupazzo{
  private Cerchio cerchio1 = new Cerchio(); //creo gli oggetti per il corpo del pupazzo
  private Cerchio cerchio2 = new Cerchio();
  private Cerchio cerchio3 = new Cerchio();
  
  private Cerchio cerchioSX = new Cerchio(); //creo gli oggetti per gli occhi del pupazzo
  private Cerchio cerchioDX = new Cerchio();
  
  private Cerchio bottone1 = new Cerchio(); //creo gli oggetti per i 4 bottoni del pupazzo
  private Cerchio bottone2 = new Cerchio();
  private Cerchio bottone3 = new Cerchio();
  private Cerchio bottone4 = new Cerchio();
  
  private Triangolo naso = new Triangolo(); //creo gli oggetti per naso e cappello
  private Triangolo cappello = new Triangolo();
  
  float x=0, y=0;
  
  int dim = 10;
  
  //x = 64
  //y = 132
  
  public Pupazzo(float x, float y, int dim){
    this.x = x;
    this.y = y;
    this.dim = dim;
    
    cerchio1.setDim(dim+140);  //assegno ad ogni cerchio dimensione, x, y e colore;
    cerchio1.setCordX(x+16);
    cerchio1.setCordY(y+168);
    cerchio1.setColore(255);
    
    cerchio2.setDim(dim+90);
    cerchio2.setCordX(x+16);
    cerchio2.setCordY(y+68);
    cerchio2.setColore(255);
    
    cerchio3.setDim(dim+50);
    cerchio3.setCordX(x+16);
    cerchio3.setCordY(y+8);
    cerchio3.setColore(255);
    
    cerchioSX.setDim(dim);
    cerchioSX.setCordX(x);
    cerchioSX.setCordY(y);
    cerchioSX.setColore(0);
    
    cerchioDX.setDim(dim);
    cerchioDX.setCordX(x+32);
    cerchioDX.setCordY(y);
    cerchioDX.setColore(0);
    
    bottone1.setDim(dim+2);
    bottone1.setCordX(x+16);
    bottone1.setCordY(y+185);
    bottone1.setColore(0);
    
    bottone2.setDim(dim+2);
    bottone2.setCordX(x+16);
    bottone2.setCordY(y+90);
    bottone2.setColore(0);
    
    bottone3.setDim(dim+2);
    bottone3.setCordX(x+16);
    bottone3.setCordY(y+60);
    bottone3.setColore(0);
    
    bottone4.setDim(dim+2);
    bottone4.setCordX(x+16);
    bottone4.setCordY(y+145);
    bottone4.setColore(0);
    
    naso.setX1(x+21);
    naso.setX2(x+16);
    naso.setX3(x+11);
    naso.setY1(y+13);
    naso.setY2(y+23);
    naso.setY3(y+13);
    naso.setColore(color(255,69,9));
    
    cappello.setX1(x-14);
    cappello.setX2(x+16);
    cappello.setX3(x+46);
    cappello.setY1(y-17);
    cappello.setY2(y-72);
    cappello.setY3(y-17);
    cappello.setColore(color(255,0,0));
  }
  
  public void show(){
    cerchio1.show();
    cerchio2.show();
    cerchio3.show();
    
    cerchioSX.show();
    cerchioDX.show();
    
    bottone1.show();
    bottone2.show();
    bottone3.show();
    bottone4.show();
    
    naso.show();
    cappello.show();
  }
}
