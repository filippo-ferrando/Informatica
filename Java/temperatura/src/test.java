public class test {
    public static void main(String[] args){
        Temperatura temp;
        temp=new Temperatura();
        temp.setGradiC(34);
        System.out.println(temp.toString());
        System.out.println("in F: "+temp.getGradiF());
    }
}
