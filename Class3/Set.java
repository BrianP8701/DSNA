package Class3;

import java.util.ArrayList;
import java.util.HashSet;

public class Set {

    // Primitive Data Types - String, int...

    // Objects

    // Data Structures: ArrayList, HashSet, HashMap

    public static void main(String[] args) {

        // Making an arraylist
        // type, name      value
        ArrayList list = new ArrayList();

        int x = 5;

        list.add(4);
        list.add(4);
        list.add(5);
    


        // A set is the exact same as a list, but it can only have one of each element.
        HashSet set = new HashSet<>();
        set.add(4);
        set.add(6);
        set.add(5);

        if(set.contains(6)){
            System.out.println("We have 6");
        }

        System.out.println(set);

        HashSet elephant = new HashSet<>();

        elephant.add(4);
        elephant.add(5.444);
        elephant.add("Hello");
        elephant.add("hello");

        System.out.println(elephant);


        
    }
    
}
