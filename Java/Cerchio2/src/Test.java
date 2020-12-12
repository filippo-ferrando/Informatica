public class Test {
    private Cerchio c;

    public void settings(){
        size (640,360);
    }

    public void setup(){
        background(0,255,255);
        c=new Cerchio();
    }

    public void draw(){
        //creazione di un colore a caso
        //random restituisce un float [0..256)
        c.setCordX((float) (Math.random())*640);
        c.setCordY((float) (Math.random())*360);
        c.setColore(color(random(256), random(256), random(256)));
        c.setDim((float) (((Math.random())*190)+10));
        c.show();
        delay(300);
        //stampa a console
        println("colore: ", red(c.getColore()), "-",
                green(c.getColore()), "-",
                blue(c.getColore()));
    }

}
