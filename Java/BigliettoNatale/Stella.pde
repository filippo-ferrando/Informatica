public class Stella{
  float x, y;
  float dim;
  
  public Stella(float x, float y, float dim){
    this.x = x;
    this.y = y;
    this.dim = dim;
  }
  
  public void show(){
    translate(x,y);
    fill(245, 203, 86);
    scale(dim);
    
    beginShape();
    vertex(0, -50);
    vertex(14, -20);
    vertex(47, -15);
    vertex(23, 7);
    vertex(29, 40);
    vertex(0, 25);
    vertex(-29, 40);
    vertex(-23, 7);
    vertex(-47, -15);
    vertex(-14, -20);
    endShape();
  }
}
