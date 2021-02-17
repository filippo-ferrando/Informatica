public class Test {
    public static void main(String[] args) throws ValoreNonValido {
        Agenzia esa= new Agenzia("ESA");
        Agenzia nasa= new Agenzia("NASA");

        Componente m= new Motore("motore1", 10, 70, 50);

        Componente s= new SerbatoioCarburante("serbatoio1", 30, 50);


        Componente sens= new ModuloSonda("sonda1",30, Tipologia.FOTOSENSORI);

        Missile mis= new Missile("Forneris");




        mis.add(m);
        mis.add(s);
        mis.add(m);
        mis.add(s);


        System.out.println(mis.toString());

        if(mis.puoVolare()){
            System.out.println("partiamo!!");
        }else{

            System.out.println("mamma butta la pasta");
        }





        

    }
}
