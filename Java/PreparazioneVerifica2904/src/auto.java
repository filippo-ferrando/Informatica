public class auto {
    float altezza;
    biglietto ticket;


    public auto(float altezza, biglietto ticket) {
        this.altezza = altezza;
        this.ticket = ticket;
    }

    public void takeBiglietto(int codiceAppartamento, int codicePosto){
        this.ticket = garage.daiBiglietto(codicePosto, codiceAppartamento);
    }

    public biglietto returnBiglietto(){
        biglietto temp;
        temp = this.ticket;

        this.ticket = null;

        return temp;

    }
}
