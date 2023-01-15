package Class2;


// Dynamic List

// Built of arrays
public class MakingAList {
    
    



}

// Binary tree, which stay sorted
class List {
    int index = 0;
    int[] array = new int[16];

    // Sometimes its O(1), sometimes it's O(N)
    public void add(int num){
        if(index == array.length){
            // Create array double the size
            int[] newArray = new int[array.length * 2];
            // Copy old array to new array
            for(int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index] = num;
        index++;
    }

    // O(1)
    public int size(){
        return index + 1;
    }

    // O(N)
    // If sorted, we could do this in O(log(n))
    public int search(int num){
        for(int i = 0; i <= index; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }

    // O(n*log(n))
    public void sort(){

    }

}
