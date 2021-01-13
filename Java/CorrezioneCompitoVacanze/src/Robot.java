public abstract class Robot {
    private String microProcessore;
    private int memoria;


    public Robot(String microProcessore, int memoria) throws ValoreScorrettoExcept {
        this.microProcessore = microProcessore;
        if(memoria > 0){
            this.memoria = memoria;
        }else{
            throw new ValoreScorrettoExcept("dimensione memoria errata");
        }
    }

    public void setMemoria(int memoria) throws ValoreScorrettoExcept {
        if(memoria > 0){
            this.memoria = memoria;
        }else{
            throw new ValoreScorrettoExcept("dimensione memoria errata");
        }
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
                "microProcessore='" + microProcessore + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
