package Class4;

public class LLHW {
    public static void main(String[] args) {
        
    }
    static class Linkedlist{
        Node head;
        Node tail;
        int size = 0;
        void add(int x, int index){

        }
        void remove(int index){
            
        }
        void add(int x){
            if(head == null){
                head = new Node(x, null);
                tail = head;
            } else{
                tail.next = new Node(x, null);
                tail = tail.next;
            }
            size++;
        }
        void remove(){
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }
        int size(){
            return this.size;
        }
        int indexOf(int x){
            int index = 0;
            Node temp = head;
            while(temp != null){
                if(temp.value == x){
                    break;
                }
                index++;
                temp = temp.next;
            }
            if(temp == null){
                return -1;
            }
            return index;
        }
        void print(){
            Node temp = head;
            while(temp.next != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println(temp.value);
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
