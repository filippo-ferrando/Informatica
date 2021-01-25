public class GeneraCodici {
    private static int cnt = 0;
    public static int creaCodici(){
        GeneraCodici.cnt += 1;
        return GeneraCodici.cnt-1;
    }
}
