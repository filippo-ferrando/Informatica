public class Testo{
  PFont font;//variabile per salvare il font caricato da me
  int sColore;
  int k;
  color colori[] = new color[4];//vettore per i colori
  float x=0, y=0;
  
  public Testo(float x, float y){
    this.x = x;
    this.y = y;
    colori[0] = color(255,0,0);  //assegno i colori
    colori[1] = color(0,128,0);
    colori[2] = color(255,255,255);
    colori[3] = color(212, 175, 55);
  }
  
  public void setX(float x){this.x=x;}
  public void setY(float y){this.y=y;}
  
  public float getX(){return x;}
  public float getY(){return y;}
  
  public void cambiaColore(){ //funzione per il cambio del colore del testo usato ancnhe per le palline (dell'albero)
    if(k > 3){
      k=0;
    }
    sColore = k;
    k++;
    
    //sColore = round(random(0, 3)); //questo di può utilizzare per usare un colore randomico
  }
  
  public void show(){
    font = createFont("font.otf", 200); //assegno il font alla variabile
    textFont(font); //utilizzo il font caricato
    textSize(80); //dimensione del testo
    fill(colori[sColore]); //colore del testo
    text("Buon Natale!", x, y);//scrivo la frase desiderata sulle coordinate volute
    textSize(50);//ridimensiono il testo per la seconda frase
    text("Ma state a casa!!", x+40, y+150); //scrivo la seconda frase spostata
  }
}
