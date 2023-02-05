package Class5;

public class Sorting {
    public static void main(String[] args) {
        
    }

    // O(N^2)
    public static int[] bubbleSort(int[] x) {
        int[] y;
        y = x;
        int temp;
        int swaps = 0;

        while(true) {
            for(int i = 0; i < y.length - 1; i++) {
                if(y[i] > y[i + 1]) {
                    temp = y[i];
                    y[i] = y[i + 1];
                    y[i + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) {
                return y;
            }
            swaps = 0;
        }
    }

    /*
     *  Determine if a given number N is a happy number.
     * 
     *   N is a happy number if after doing the following steps it reaches 1
     * 
     *     1. Square each digit, and sum them.
     *     2. Repeat
     * 
     *      81 -> 65 -> 61 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4 -> 16 -> 37 -> 30 -> 9 -> 81 -> 65 ...
     * 
     *      100 ->  1
     * 
     *      999999 -> 486
     * 
     *      Write a method that returns true or false, depending on if this is a happy number or not
     * 
     */

     public static boolean isHappy(int x){
        while(x != 1){
            int y = 0;
            while(x != 0){
                y += Math.sqrt(x%10);
            }
            x = y;
        }
        return true;
     }

    
    
}
