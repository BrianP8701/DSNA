package Class3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LogicalThinking {

    public static void main(String[] args) {
        String A = "abbc";
        String B = "cbabadcbbabbcbabaabccbabc";

        System.out.println(numOfPerm(A, B));
        
    }
    
    // O(N^2)

    // 5 -> 25
    // 100 -> 10000
    // 9999 -> 99980001
    // 1000000000 
    public static boolean hasDuplicates(int[] array){
        int num = 0;
        for(int i = 0; i < array.length-1; i++){
            int x = array[i];
            for(int j = i + 1; j < array.length; j++){
                num++;
                if(x == array[j]){
                    return true;
                }
            }
        }
        System.out.println(num);
        return false;
    }

    // 10 -> 10
    // 5 -> 5
    // 100 -> 100
    // 9999 -> 9999
    // O(N)

    // O(N)
    public static boolean hasDupes(int[] array){
        HashSet set = new HashSet();

        for(int i = 0; i < array.length; i++){
            set.add(array[i]);
        }

        return set.size() != array.length;
    }


    // gse, wgs              ->    False
    // qretqw, wtreqq        ->    True
    // Ice Cream, Cream Ice  ->    True
    // 1eYo     , Yoe1
    // 

    // HashMap    Key -> Values

    //     Characters -> The number of times we see that character

    // Check if A is a permutation of B

    // O(N)
    public static boolean isPermutation(String A, String B){

        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();

        ArrayList<Character> list = new ArrayList();

        for(int i = 0; i < A.length(); i++){
            list.add(A.charAt(i));
            if(map1.containsKey(A.charAt(i))){
                map1.put(A.charAt(i), map1.get(A.charAt(i)) + 1);
            } else{
                map1.put(A.charAt(i), 1);
            }
        }
        for(int i = 0; i < B.length(); i++){
            if(map2.containsKey(B.charAt(i))){
                map2.put(B.charAt(i), map2.get(B.charAt(i)) + 1);
            } else{
                map2.put(B.charAt(i), 1);
            }
        }
        // We have all the characters in String A and B, and how many of them we have

        // A list with all the characters in String A
        for(Character c : list){
            if(map1.get(c) != map2.get(c)){
                return false;
            }
        }

        if(map2.size() != map1.size()) return false;
        return true;
    }


    // O()

    // A - abbc
    // B - "cbabadcbbabbcbabaabccbabc"

    // O(N*M)
    public static int numOfPerm(String A, String B){
        int a = A.length(), b = B.length();
        int count = 0;
        for(int i = 0; i < b - a + 1; i++){ // This is looping in O(N) in relation to the size of B
            String substring = B.substring(i, i + a);
            if(isPermutation(A, substring)){  // It's linearlly related to how long A is.  O(N) with respect to A
                count++;
            }
        }
        return count;
    }


}
