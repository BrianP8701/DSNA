package Class1;

public class Example1 {

    // Comparing the speeds of different algorithms

    public static void main(String[] args) {
        int N = 100000;
        A(N);
        B(N);
        C(N);
        D(N);
    }


    //        O(N^2)
    public static void A(int n){ // 10000
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Hello");
            }
        }
    }

    //        O(N)
    public static void B(long n){ 
        for(int i = 0; i < n; i++){
            System.out.println("Hello");
        }
    }

    //        O(1)      

    public static void C(int n){
        System.out.println("Hello");
    }

    //       O(log(n))

    public static void D(long n){
        for(long i = 1; i < n; i *= 2){
            System.out.println(i);
            System.out.println("Hello");
        }
    }
    



}
