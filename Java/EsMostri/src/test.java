public class test {
    public static void main(String[] args) {

        //1 mostro
        Mostro m1;  //dichiarato un oggetto di tipo mostro, non occupa in spazio in memoria
        m1 = new Mostro(); //istanziato un oggetto della classe mostr0
        m1.visStato();

        //2 mostro
        Mostro m2;
        m2 = new Mostro("Giorgio", 7);
        m2.setForza(6);
        m2.visStato();

        //3 mostro
        Mostro m3;
        m3 = new Mostro(6, 9);
        m3.setNome("Piero");
        m3.visStato();

        //4 mostro
        Mostro m4;
        m4 = new Mostro(8, "Andrea");
        m4.setVita(7);
        m4.visStato();

        //5 mostro
        Mostro m5;
        m5 = new Mostro("Jeremy", 3, 7);
        m5.visStato();

        //6 mosdtro
        Mostro m6;
        m6 = new Mostro("Marco");
        m6.setVita(6);
        m6.setForza(8);
        m6.visStato();
    }
}
