package Class5;


public class HW {
    public static void main(String[] args) {
        
    }

    public static int staircaseProblem(int steps){
        int numOf2s = 0;
        int numberOfDifferentWays = 0;
        int temp = steps;
        while(numOf2s * 2 <= steps){
            numberOfDifferentWays += (factorial(temp)/(factorial(numOf2s)*factorial(temp-numOf2s)));
        }
        return numberOfDifferentWays;
    }

    public static int factorial(int x){
        int ans = 1;
        for(int i = x; i>1; i--){
            ans*=i;
        }
        return ans;
    }
}



