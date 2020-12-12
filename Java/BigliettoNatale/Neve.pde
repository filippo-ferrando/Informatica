class Neve{
  int quantity = 300;
  float [] xPosition = new float[quantity];
  float [] yPosition = new float[quantity];
  int [] flakeSize = new int[quantity];
  int [] direction = new int[quantity];
  int minFlakeSize = 1;
  int maxFlakeSize = 5;
  
  public Neve(){
    for(int i = 0; i < quantity; i++) {
      flakeSize[i] = round(random(minFlakeSize, maxFlakeSize));
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
        xPosition[i] += map(flakeSize[i], minFlakeSize, maxFlakeSize, .1, .5);
      } else {
        xPosition[i] -= map(flakeSize[i], minFlakeSize, maxFlakeSize, .1, .5);
      }
      
      yPosition[i] += flakeSize[i] + direction[i]; 
      
      if(xPosition[i] > width + flakeSize[i] || xPosition[i] < -flakeSize[i] || yPosition[i] > height + flakeSize[i]) {
        xPosition[i] = random(0, width);
        yPosition[i] = -flakeSize[i];
      }
      
    }
    
  }
}
