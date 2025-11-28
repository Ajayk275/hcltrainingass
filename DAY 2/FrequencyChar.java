public class FrequencyChar {
    public static void main(String[] args) {
        String s = "hello";
        char ch = 'l';
        int count = 0;

        for (char c : s.toCharArray())
            if (c == ch) count++;

        System.out.println("Frequency: " + count);
    }
}
