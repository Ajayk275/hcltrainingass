package collecction;

import java.util.Map;
import java.util.TreeMap;

public class treeassingment {

    public static void main(String[] args) {
        
        TreeMap<Integer,String> m1 = new TreeMap<>();
        
        m1.put(1, "ajay");
        m1.put(2, "bharath");
        m1.put(3, "sanjith");
        m1.put(4, "sanju");
        m1.put(5, "raju");
        
        System.out.println("\nDescending Order:");
        
        
        for(Map.Entry<Integer,String> map : m1.descendingMap().entrySet()){
            System.out.println("Key: " + map.getKey() + "  Value: " + map.getValue());
        }
    }
}
