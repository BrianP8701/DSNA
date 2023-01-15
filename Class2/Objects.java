package Class2;

import java.util.ArrayList;

public class Objects {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        Water water = new Water(60);

    }

    // Primitive Data Types: int, long, double, boolean...
    // Arrays -> Primitive Data Type
    
    // Everything else is objects
    
}


// An object is a way for us to encapsulate functionality
class Water{
    // Attributes
    int temprature;
    String taste = "Sour";

    // Constructor
    Water(int temp){
        this.temprature = temp;
    }

    // Add methods
}
