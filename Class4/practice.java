package Class4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class practice {
    public static void main(String[] args) {
        if(isPP("tacocat")){
            System.out.println("MADE IT");
        }
    }

    public static boolean isPP(String str){
        // Has all the letters in the word
        HashSet<Character> list = new HashSet<>();
        // Maps letters to how many they show up in the word
        HashMap<Character, Integer> map = new HashMap<>();


        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            list.add(c);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else{
                map.put(c, 1);
            }
        }
        if(str.length() % 2 == 0){
            for(char c : list){
                if(map.get(c) % 2 == 1) return false;
            }
        } else{
            int numOfOdds = 0;
            for(char c : list){
                if(map.get(c) % 2 == 1) numOfOdds++;
            }
            if(numOfOdds != 1) return false;
        }
        return true;
    }

    // A + B = target

    // target - A = B

    public static int[] indexOfSum(int[] arr, int target){
        int size = arr.length;
        int[] answer = {0, 0};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < size; i++){
            set.add(arr[i]);
        }
        int num = 0;
        for(int i = 0; i < size; i++){
            num = target - arr[i];
            if(set.contains(num)) break;
        }
        answer[0] = arr.indexOf(num);
        answer[1] = arr.indexOf(target - num);
    }
}
