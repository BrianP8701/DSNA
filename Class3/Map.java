package Class3;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Key  ->  Values

        // For example, we can have addresses -> locations

        // We have people and how much money they have


        /* Key       Value
          John         180
          Kevin        2
          Sofia        100

        */
        map.put("John", 99);
        map.put("Kevin", 2);
        map.put("Sofia", 100);

        // We can access values given the key
        System.out.println(map.get("John"));

        // Each key can only have one value
        map.put("John", 180);

        System.out.println(map.get("John"));

        if(map.containsKey("Sofia")){
            System.out.println("Already have key");
        } else{
            map.put("Sofia", 8);
        }

        
        map.put("Brian", 99999);

        // Getting is O(1)
        map.get("John");


    }
}
