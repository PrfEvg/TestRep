import java.util.ArrayList;

public class Main{
    public static void main(String... args){
        System.out.println("Hello world!!!!");
        System.out.println("Privet, kak dela?");
        int[] s = new int[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = i;
            System.out.println(i);
        }
        List<String> list = new ArrayList<>();
        for (String a : list) {
            System.out.println(a);
        }
        //add some comment from user1
    }
}