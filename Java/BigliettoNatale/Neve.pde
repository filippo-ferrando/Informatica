class Neve{
  private final int QUANTITY = 300;
  private float [] xPosition = new float[QUANTITY];
  private float [] yPosition = new float[QUANTITY];
  private int [] flakeSize = new int[QUANTITY];
  private int [] direction = new int[QUANTITY];
  private final int MINFLAKESIZE = 1;
  private final int MAXFLAKESIZE = 5;

  
  public Neve(){
    for(int i = 0; i < QUANTITY; i++) {
      flakeSize[i] = round(random(MINFLAKESIZE, MAXFLAKESIZE));
      xPosition[i] = random(0, width);
      yPosition[i] = random(0, height);
      direction[i] = round(random(0, 1));
    }
    
  }
  
  public void frame() {
    
    background(0);
    fill(255,255,255);
    
    for(int i = 0; i < xPosition.length; i++) {
      
      ellipse(xPosition[i], yPosition[i], flakeSize[i], flakeSize[i]);
      
      if(direction[i] == 0) {
        xPosition[i] += map(flakeSize[i], MINFLAKESIZE, MAXFLAKESIZE, .1, .5);
      } else {
        xPosition[i] -= map(flakeSize[i], MINFLAKESIZE, MAXFLAKESIZE, .1, .5);
      }
      
      yPosition[i] += flakeSize[i] + direction[i]; 
      
      if(xPosition[i] > width + flakeSize[i] || xPosition[i] < -flakeSize[i] || yPosition[i] > height + flakeSize[i]) {
        xPosition[i] = random(0, width);
        yPosition[i] = -flakeSize[i];
      }
      
    }
    
  }
}
