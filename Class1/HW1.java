package Class1;

public class HW1 {
    public static void main(String[] args) {
        
    }

    public static int A (int N){
        int x = 0;
        for(int i = 0; i < N; i++){
            for(int k = 0; k < 1000; k++){
                x++;
            }
        }
        return x;
    }
    // This method calls itself.
    public static int B (int N){
        if(N < 0){
            return -1;
        }else if(N == 0){
            return 1 ;
        }
        else{
            return N * B(N-1) ;
        }
    }



    public static int powersOf2 (int n){
        if(n < 1){
            return 0;
        }
        else if( n == 1 ){
            System.out.println(1);
            return 1;
        }
        else{
            int prev = powersOf2 (n/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}
