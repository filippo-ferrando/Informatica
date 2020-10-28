public class Mostro {
    //attributi
    private String nome;
    private int vita;
    private int forza;

    private final int VITAMAX = 100;
    private final int VITAMIN = 0;

    //metodi
    public void setVita(int vita){
        if(vita >= VITAMIN && vita <= VITAMIN){
            this.vita = vita;
        }else{
            this.vita = VITAMAX / 2;
        }

    }


}
