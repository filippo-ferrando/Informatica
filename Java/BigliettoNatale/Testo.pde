public class Testo{
  PFont font;
  int sColore;
  int k;
  color colori[] = new color[4];
  
  public Testo(){
    colori[0] = color(255,0,0);
    colori[1] = color(0,128,0);
    colori[2] = color(255,255,255);
    colori[3] = color(212, 175, 55);
  }
  
  public void cambiaColore(){
    if(k > 3){
      k=0;
    }
    sColore = k;
    k++;
  }
  
  public void scriviTesto(){
    font = createFont("font.otf", 200);
    textFont(font);
    textSize(80);
    fill(colori[sColore]);
    text("Buon Natale!", 170, 80);
  }
}
