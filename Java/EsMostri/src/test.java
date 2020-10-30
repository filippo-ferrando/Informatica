public class test {
    public static void main(String[] args) {
        Mostro m1;  //dichiarato un oggetto di tipo mostro, non occupa in spazio in memoria
        m1 = new Mostro(); //istanziato un oggetto della classe mostr0
        m1.setNome("Giovanni");
        m1.setForza(70);
        m1.setVita(70);

        m1.visStato();

        //altro mostro
        Mostro m2;
        m2 = new Mostro();
        m2.visStato();
    }
}
