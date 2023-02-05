package Class5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Practice {
    public static void main(String[] args) {
        if(good("()(())")){
            System.out.println("GOOd");
        }


    }


    /*
     * Check if the string is good.
     * 
     * (()) -> True
     * (()  -> False
     * ((()()) -> False
     * (()))) -> False
     * ()(()) -> True
     * (()()) -> True
     * ())(() -> False
     * 
     */

     /* 
      Stack

      When we see a ( we push
      When we see a ) we pop

      ())(()
      
     */



     public static boolean good(String str){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(1);
            } else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
     }
    
}
