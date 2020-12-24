class Neve{
  private final int QUANTITY = 400;
  private float [] xPosition = new float[QUANTITY];
  private float [] yPosition = new float[QUANTITY];
  private int [] flakeSize = new int[QUANTITY];
  private int [] direction = new int[QUANTITY];
  private final int MINFLAKESIZE = 1;
  private final int MAXFLAKESIZE = 5;

  
  public Neve(){
    for(int i = 0; i < QUANTITY; i++) {
      flakeSize[i] = round(random(MINFLAKESIZE, MAXFLAKESIZE));  //decido randomicamente la dimensione la x e la y e la direzione di ogni palline (400 volte)
      xPosition[i] = random(0, width);
      yPosition[i] = random(0, height);
      direction[i] = round(random(0, 1));
    }
    
  }
  
  public void show() {
    
    background(0);
    fill(255,255,255);
    
    for(int i = 0; i < xPosition.length; i++) {
      
      ellipse(xPosition[i], yPosition[i], flakeSize[i], flakeSize[i]); //creo la pallina
      
      if(direction[i] == 0) { //controlla se la pallina va dritta
        xPosition[i] += map(flakeSize[i], MINFLAKESIZE, MAXFLAKESIZE, .1, .5); //aggiunge una data x mappandola tra i valori inseriti
      } else {
        xPosition[i] -= map(flakeSize[i], MINFLAKESIZE, MAXFLAKESIZE, .1, .5); //toglie una data x mappandola tra i valori inseriti
      }
      
      yPosition[i] += flakeSize[i] + direction[i]; //calcola la y
      
      if(xPosition[i] > width + flakeSize[i] || xPosition[i] < -flakeSize[i] || yPosition[i] > height + flakeSize[i]) { //se la pallina sfora la finestra
        xPosition[i] = random(0, width); //ri-decido randomicamente la x e la y
        yPosition[i] = -flakeSize[i];
      }
      
    }
    
  }
}
