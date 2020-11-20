public class Concessionaria {
     private String nome;
     private int maxNum;
     private Macchina[] parcoAuto;
     private int nMacchine=0;

     public Concessionaria(String nome, int maxNum){
         this.nome = new String();
         this.nome = nome;
         this.maxNum = maxNum;
         this.parcoAuto = new Macchina[maxNum];
     }

     public void addAuto(Macchina auto){
         if(nMacchine<maxNum){
             parcoAuto[nMacchine] = auto;
             nMacchine++;
         }else{
             System.out.println("Limite macchine raggiunto");
         }
     }

     public void trovaColore(String nome){
         for(int cnt=0;cnt<nMacchine;cnt++){
             if(parcoAuto[cnt].getModello().equalsIgnoreCase(nome) == true){
                 System.out.println(parcoAuto[cnt].getColore());
             }
         }

     }


     public String toString(){
         String temp = new String();
         for(int cnt=0;cnt<nMacchine;cnt++){
             temp = temp + "\n" + parcoAuto[cnt].getModello() + " " + parcoAuto[cnt].getColore() + " " + parcoAuto[cnt].getPrezzo();
         }
         return temp;
     }

}
