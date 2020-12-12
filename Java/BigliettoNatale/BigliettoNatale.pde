Pupazzo pupazzo = new Pupazzo();
Neve neve = new Neve();
Albero albero = new Albero();
Testo buonNatale = new Testo();


void setup(){
  size(800, 350);
  frameRate(60);
  noStroke();
  smooth();
}

int sPrec = 0;

void draw(){
  neve.frame();
  pupazzo.creaPupazzo();
  albero.creaAlbero();
  
  if(millis() - sPrec > 1000){
    buonNatale.cambiaColore();
    sPrec = millis();
  }
  
  buonNatale.scriviTesto();
}
