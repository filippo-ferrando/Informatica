import javax.management.remote.rmi.RMIServerImpl;

public class Test {
    public static void main(String[] args) throws ValoreNonValido {
        Agenzia esa= new Agenzia("ESA");
        Agenzia nasa= new Agenzia("NASA");


        Componente m= new Motore("motore1", 10, 70, 50);
        Componente m1= new Motore("motore2", 15, 5, 10);
        Componente m2= new Motore("motore3", 80, 98, 40);
        Componente m3= new Motore("motore4", 120, 31, 90);

        Componente s= new SerbatoioCarburante("serbatoio1", 30, 50);
        Componente s1= new SerbatoioCarburante("serbatoio2", 40, 60);
        Componente s2= new SerbatoioCarburante("serbatoio3", 20, 55);
        Componente s3= new SerbatoioCarburante("serbatoio4", 90, 150);


        Componente sens= new ModuloSonda("sonda1",30, Tipologia.FOTOSENSORI);
        Componente sens1= new ModuloSonda("sonda2",70, Tipologia.AUDIOSENSORI);
        Componente sens2= new ModuloSonda("sonda3",40, Tipologia.FOTOSENSORI);
        Componente sens3= new ModuloSonda("sonda4",20, Tipologia.AUDIOSENSORI);

        Missile mis= new Missile("hey");
        Missile mis2 = new Missile("ciao");
        Missile mis3 = new Missile("come");
        Missile mis4 = new Missile("stai");


        mis.add(m);
        mis.add(s);
        mis.add(sens);

        mis2.add(m1);
        mis2.add(s1);
        mis2.add(sens1);

        mis3.add(m2);
        mis3.add(s2);
        mis3.add(sens2);

        mis4.add(m3);
        mis4.add(s3);
        mis4.add(sens3);


        esa.add(mis);
        esa.add(mis3);

        nasa.add(mis2);
        nasa.add(mis4);

        if(esa.totMissiliCheVolano() > nasa.totMissiliCheVolano()){
            System.out.println("L'ESA ha più missili che volano per 1h");
        }else{
            System.out.println("La NASA ha più missili che volano per 1h");
        }

        esa.trovaMissile("come");





        

    }
}
