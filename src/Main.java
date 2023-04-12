import Package1.*;
public class Main {
    public static void main(String[] args) {
        SpaceJoiner joiner = new SpaceJoiner();
        String s1 = "Bună ziua";
        String s2 = "lumea";
        String result = joiner.join(s1, s2);
        System.out.println(result);
    }
}