package Class5;

public class Stack {

    public static void main(String[] args) {
        
    }

    static class stack{
        
        // Push -> Adding to top of stack
        // Pop -> Removing an element from top of stack
        // Peek -> Returning the value of element on top of stack

        Node top;
        int size;

        void push(int x){
            if(top == null){
                top = new Node(x, null);
            } else{
                top = new Node(x, top);
            }
        }

        int peek(){
            return top.value;
        }

        int pop(){
            int ans = top.value;
            top = top.next;
            return ans;
        }

    }

    static class Node{
        int value;
        Node next;

        Node(int value, Node node){
            this.value = value;
            this.next = node;
        }
    }
    
}
