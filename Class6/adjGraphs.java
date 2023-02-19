package Class6;

import java.util.HashMap;
import java.util.ArrayList;

public class adjGraphs {
    
    public static void main(String[] args) {
    
        AdjacencyMatrix m = new AdjacencyMatrix(5);

        Node<Integer> n = new Node(4);

        Node<String> s = new Node("Hello");
       


    }

    public static void print(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    

}

class AdjacencyMatrix{
    int size;
    int[][] matrix;

    AdjacencyMatrix(int size){
        this.matrix = new int[size][size];
        this.size = size;
    }

    void addEdge(int a, int b){
        matrix[a][b] = 1;
    }
}

class AdjacencyList<T>{
    HashMap<Node<T>, ArrayList<Node<T>>> map = new HashMap<Node<T>, ArrayList<Node<T>>>();

    void addEdge(Node<T> a, Node<T> b){
        if(map.containsKey(a)){
            map.get(a).add(b);
        } else{
            ArrayList<Node<T>> list = new ArrayList<>();
            list.add(b);
            map.put(a, list);
        }
    }
}

class Node<T>{
    T value;

    Node(T value){
        this.value = value;
    }
}




