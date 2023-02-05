package Class5;

public class Queue {
    public static void main(String[] args) {
        
    }

    //  1 -> 2 -> 4 -> 8 -> 3

    // Add to the back
    // Remove from the front

    static class queue{
        Node front;
        Node back;

        void push(int x){
            if(back == null){
                back = new Node(x, null);
                front = back;
            } else{
                back.next = new Node(x, null);
                back = back.next;
            }
        }

        int peek(){
            return front.value;
        }

        int pop(){
            int ans = front.value;
            front = front.next;
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
