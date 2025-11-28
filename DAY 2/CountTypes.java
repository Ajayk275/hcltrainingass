public class CountTypes {
    public static void main(String[] args) {
        String s = "Abc123@#";
        int digits = 0, letters = 0, special = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) letters++;
            else special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }
}
