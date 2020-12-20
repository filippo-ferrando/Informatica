public class Testo{
  PFont font;
  int sColore;
  int k;
  color colori[] = new color[4];
  float x=0, y=0;
  
  public Testo(float x, float y){
    this.x = x;
    this.y = y;
    colori[0] = color(255,0,0);
    colori[1] = color(0,128,0);
    colori[2] = color(255,255,255);
    colori[3] = color(212, 175, 55);
  }
  
  public void setX(float x){this.x=x;}
  public void setY(float y){this.y=y;}
  
  public float getX(){return x;}
  public float getY(){return y;}
  
  public void cambiaColore(){
    if(k > 3){
      k=0;
    }
    sColore = k;
    k++;
    
    //sColore = round(random(0, 3));
  }
  
  public void show(){
    font = createFont("font.otf", 200);
    textFont(font);
    textSize(80);
    fill(colori[sColore]);
    text("Buon Natale!", x, y);
    textSize(50);
    text("Ma state a casa!!", x+40, y+150);
  }
}
