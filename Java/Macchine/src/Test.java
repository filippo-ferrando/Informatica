public class Test {
    public static void main(String[] args){
        Macchina auto1 = new Macchina("impreza","blu", 20000f);
        Macchina auto2 = new Macchina("lacer","rosso", 15000f);
        Macchina auto3 = new Macchina("supra","bianco", 20500f);
        Macchina auto4 = new Macchina("skyline","nero", 35000f);
        Macchina auto5 = new Macchina("ecplise","verde", 12000f);

        Concessionaria c1 = new Concessionaria("Gino", 30);

        c1.addAuto(auto1);
        c1.addAuto(auto2);
        c1.addAuto(auto3);
        c1.addAuto(auto4);
        c1.addAuto(auto5);

        System.out.println(c1.toString());
    }
}
