import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3, 2, 5, 5};

        Map<Integer, Integer> freq = new LinkedHashMap<>();

        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        System.out.println("Frequencies: " + freq);
    }
}
