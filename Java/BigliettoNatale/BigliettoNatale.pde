int posXAlbero = 650;
int posYAlbero = 75;

int posXLuci = 560;
int posYLuci = 110;

int posXPupazzo = 64;
int posYPupazzo = 132;
int dimPupazzo = 10;


Pupazzo pupazzo = new Pupazzo(posXPupazzo, posYPupazzo, dimPupazzo);
Neve neve = new Neve();
Albero albero = new Albero(posXAlbero, posYAlbero);
Testo buonNatale = new Testo();
LuciAlbero lucine = new LuciAlbero(posXLuci, posYLuci);


void setup(){
  pupazzo = new Pupazzo(posXPupazzo, posYPupazzo, dimPupazzo);
  albero = new Albero(posXAlbero,posYAlbero);
  size(800, 350);
  frameRate(60);
  smooth();
}

int sPrec = 0;

void draw(){
  noStroke();
  neve.frame();
  albero.show();
  
  if(millis() - sPrec > 1000){
    buonNatale.cambiaColore();
    sPrec = millis();
  }
  
  buonNatale.scriviTesto();
  
  lucine.luci();
  
 pupazzo.show();
  
}
