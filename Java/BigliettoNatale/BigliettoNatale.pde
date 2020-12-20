int posXAlbero = 650;
int posYAlbero = 75;

int posXLuci = 560;
int posYLuci = 110;

int posXPupazzo = 64;
int posYPupazzo = 132;
int dimPupazzo = 10;

int posXTesto = 170;
int posYTesto = 80;

int posXStella = 650;
int posYStella = 55;
float dimStella = 0.7;


Pupazzo pupazzo = new Pupazzo(posXPupazzo, posYPupazzo, dimPupazzo);
Neve neve = new Neve();
Albero albero = new Albero(posXAlbero, posYAlbero);
Testo buonNatale = new Testo(posXTesto, posYTesto);
LuciAlbero lucine = new LuciAlbero(posXLuci, posYLuci);
Stella stellacadente = new Stella(posXStella, posYStella, dimStella);


void setup(){
  pupazzo = new Pupazzo(posXPupazzo, posYPupazzo, dimPupazzo);
  albero = new Albero(posXAlbero,posYAlbero);

  size(800, 350);
  frameRate(30);
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
  
  buonNatale.show();
  
  lucine.luci(); 
  
  pupazzo.show();
  
  stellacadente.show();
}
