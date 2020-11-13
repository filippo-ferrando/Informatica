public class test {
    public static void main(String[] args){
        Rettangolo r1 = new Rettangolo(3, 7);
        cerchio c1 = new cerchio(5);

        System.out.println("Base: " + r1.getBase() + "Altezza: " + r1.getAltezza());
        System.out.println("Raggio: " + c1.getRaggio());

        if(c1.getArea() == r1.getArea())
            System.out.println("Le aree sono uguali");
        else
            System.out.println("Le aree sono diverse");

        Rettangolo r2 = new Rettangolo();
        cerchio c2 = new cerchio();

        System.out.println("Base: " + r2.getBase() + "Altezza: " + r2.getAltezza());
        System.out.println("Raggio: " + c2.getRaggio());

        if(c2.getArea() == r2.getArea())
            System.out.println("Le aree sono uguali");
        else
            System.out.println("Le aree sono diverse");


    }
}
