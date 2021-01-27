public class GeneraCodice {
    private static int cnt = 0;
    public static int creaCodici(){
        GeneraCodice.cnt += 1;
        return GeneraCodice.cnt-1;
    }
}
