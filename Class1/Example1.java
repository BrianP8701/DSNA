package Class1;

public class Example1 {
    public static void main(String[] args) {
        int N = 100000;

        B(N);
    }


    // equation is N ^ 2    ->   O(N^2)

    public static void A(int n){ // 10000
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Hello");
            }
        }
    }

    // equation is N   ->   O(N)

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
    //   1   :    1
    //   2   :    1
    //   10  :    4
    //   100 :    7

    public static void D(long n){
        for(long i = 1; i < n; i *= 2){
            System.out.println(i);
            System.out.println("Hello");
        }
    }
    



}
