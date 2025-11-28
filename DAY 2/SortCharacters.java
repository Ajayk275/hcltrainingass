import java.util.*;

public class SortCharacters {
    public static void main(String[] args) {
        String s = "dcba";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        System.out.println(new String(ch));
    }
}
