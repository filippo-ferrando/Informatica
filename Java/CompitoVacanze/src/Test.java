public class Test {
    public static void main(String[] args) {
        SchoolRobot prova = new SchoolRobot();
        SchoolRobot prova2 = new SchoolRobot();

        prova.addCliente();
        prova2.addCliente();

        System.out.println(prova.toString());
        System.out.println("\n");
        System.out.println(prova2.toString());
    }
}
