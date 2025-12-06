package collecction;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        v.add("Dates");

        System.out.println("Vector Elements: " + v);

        System.out.println("Element at index 1: " + v.get(1));

   
        v.remove("Cherry");
        System.out.println("After removing 'Cherry': " + v);

      
        System.out.println("Iterating Vector:");
        for (String fruit : v) {
            System.out.println(fruit);
        }

        
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
    }
}
