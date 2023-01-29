package Class4;

public class LinkedList {
    public static void main(String[] args) {
        
        LList list = new LList();

        list.add(8);
        list.add(6);
        list.add(5);

        list.print();

        System.out.println(list.size());

    }

//    8 -> 6 -> 5 -> 9 -> 

// Tail = 
// Head

    static class LList{
        Node head;
        Node tail;
        int size = 0;
        // To add to our linked list
        // O(1)
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
        // Remove last node from list
        // O(N)
        void remove(){
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }

        // O(1)
        int size(){
            return this.size;
        }

        // O(N)
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
