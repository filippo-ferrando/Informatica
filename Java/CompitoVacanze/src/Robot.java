public class Robot {
    private int memoria;
    private String microProcessore;

    public Robot(int memoria, String microProcessore) {
        this.memoria = memoria;
        this.microProcessore = microProcessore;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getMicroProcessore() {
        return microProcessore;
    }

    public void setMicroProcessore(String microProcessore) {
        this.microProcessore = microProcessore;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "memoria=" + memoria +
                ", microProcessore='" + microProcessore + '\'' +
                '}';
    }
}
