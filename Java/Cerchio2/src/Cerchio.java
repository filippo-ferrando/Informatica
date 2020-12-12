public class Cerchio{
    private float dim;
    private final float DIM_DEFAULT = 100;
    private float cordX;
    private float cordY;
    private color colore;
    private color bordo;

    public Cerchio(){  //costruttore
        dim=  (float) ((Math.random())*190)+10;
        cordX = (float) (Math.random())*640;
        cordY =  (float) (Math.random())*360;
        colore= color(255,255,255);  //new color
        bordo= color(0,0,0);
    }

    public void setDim(float dim){
        if (dim >= 0){
            this.dim = dim;
        }
    }
    public float getDim(){
        return dim;
    }
    public void setCordX(float x){
        cordX = x;
    }
    public void setCordY(float y){
        cordY = y;
    }
    public float getCordX(){
        return cordX;
    }
    public float getCordY(){
        return cordY;
    }
    public void setColore(color colore){
        this.colore = color(colore);    //per passare il colore bisogna fare così
    }
    public color getColore(){
        return colore;
    }
    public color getBordo(){
        return bordo;
    }
    public void setBordo(color colore){
        bordo = colore;
    }

    public void show(){
        strokeWeight(3);  //spessore
        stroke(bordo);  //colore bordo
        fill(colore);  //colore di riempimento
        circle(cordX, cordY, dim);  //centro X,Y e diametro dim
    }


}
