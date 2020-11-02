public class Mostro {
    //attributi
    private String nome;
    private int vita;
    private int forza;
    private final int VITA_MAX = 100;
    private final int VITA_MIN = 0;
    private final int FORZA_MAX = 10;
    private final int FORZA_MIN = 5;

    //metodi
    public void setVita(int vita){
        if(vita >=VITA_MIN && vita <= VITA_MAX){
            this.vita=vita;
        }else{
            this.vita = VITA_MAX / 2;
        }
    }
    public void setForza(int forza){
        if(forza >=FORZA_MIN && forza <= FORZA_MAX){
            this.forza = forza;
        }else{
            this.forza = FORZA_MIN;
        }
    }
    public int getForza(){
        return forza;
    }
    public int getVita(){
        return vita;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Mostro(){    //costruttore senza parametri
        // gli attributi sono inizializzati a dei valori di defualt
        nome = "Default";
        vita = VITA_MAX / 2;
        forza = FORZA_MIN;
    }

    public Mostro(String nome, int vita){
        setNome(nome);
        setVita(vita);
    }

    public Mostro(int vita, int forza){
        setVita(vita);
        setForza(forza);
    }

    public Mostro(int forza, String nome){
        setNome(nome);
        setForza(forza);
    }

    public Mostro(String nome, int vita, int forza){
        setNome(nome);
        setVita(vita);
        setForza(forza);
    }

    public Mostro(String nome){
        setNome(nome);
    }



    public void visStato(){
        System.out.println("nome = "+getNome());
        System.out.println("vita = "+getVita()+"%");
        System.out.println("forza = "+getForza());
        System.out.println();
    }
}
