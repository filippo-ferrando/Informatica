public class Test {
    public static void main(String[] argv) {
        Zoo zoo = new Zoo("Mio", 2);
        zoo.add( new Scoiattolo());
        zoo.add(new Cane());
        zoo.presentatevi();
    }
}
