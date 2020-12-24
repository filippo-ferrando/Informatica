int posXAlbero = 650;  //coordinate per disegnare gli oggetti
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


Pupazzo pupazzo = new Pupazzo(posXPupazzo, posYPupazzo, dimPupazzo);  //chiamo le funzioni passando le coordinate dichiarate in precedenza
Neve neve = new Neve();
Albero albero = new Albero(posXAlbero, posYAlbero);
Testo buonNatale = new Testo(posXTesto, posYTesto);
LuciAlbero lucine = new LuciAlbero(posXLuci, posYLuci);
Stella stellacadente = new Stella(posXStella, posYStella, dimStella);


void setup(){
  pupazzo = new Pupazzo(posXPupazzo, posYPupazzo, dimPupazzo);
  albero = new Albero(posXAlbero,posYAlbero);

  size(800, 350); //dimensione dello schermo
  frameRate(30); //frame per secondo, dimezzatti per avere le animaizoni più fluide
  smooth(); //disegna le forme geometriche con bordi stondati
}

int sPrec = 0; //salvataggio del tempo per cambiare il colore più lentamente rispetto al ciclo generale di processing

void draw(){
  noStroke(); //toglie i bordi per disegnare la neve
  neve.show();
  albero.show();
  
  if(millis() - sPrec > 1000){ //controlla il passare del tempo per far cambviare i colori più lentamente rispetto ai 30fps di processing
    buonNatale.cambiaColore();
    sPrec = millis();
  }
  
  buonNatale.show();
  
  lucine.luci(); 
  
  pupazzo.show();
  
  stellacadente.show();
}
