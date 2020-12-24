public class LuciAlbero{
  private final int quantity = 9;  //dichiaro le variabili e costanti necessarie
  private final int maxSize = 15; 
  private final int minSize = 10;
  private float [] xPosition = new float[quantity];  //per creaqre le palline uso un vettore di coordinate x e y
  private float [] yPosition = new float[quantity];
  private int [] size = new int[quantity];
  
  float x=0, y=0; //coordinate relative
  
  //x = 520
  //y = 100
  
  public LuciAlbero(float x, float y){
    this.x = x;
    this.y = y;
    
    for(int k=0;k<quantity;k++){
      size[k] = round(random(minSize,maxSize));
    }
    
    xPosition[0] = x;
    xPosition[1] = x+45;
    xPosition[2] = x+147;
    xPosition[3] = x+170;
    xPosition[4] = x+101;
    xPosition[5] = x+135;
    xPosition[6] = x+87;
    xPosition[7] = x+61;
    xPosition[8] = x+570;
    
    yPosition[0] = y+100;
    yPosition[1] = y+30;
    yPosition[2] = y+60;
    yPosition[3] = y+140;
    yPosition[4] = y+90;
    yPosition[5] = y+40;
    yPosition[6] = y;
    yPosition[7] = y+150;
    yPosition[8] = y+80;
  }
  
  public void luci(){
    for(int i=0; i<quantity; i++){
      noStroke(); //tolgo il bordo alle palline
      ellipse(xPosition[i], yPosition[i], size[i], size[i]);
    }
  }
}
