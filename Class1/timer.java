package Class1;

public class timer {

    // Big O Notation

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        testMethod();

        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    public static void testMethod(){
        for(int i = 0; i < 100000; i++){
            System.out.println("Bop");
        }
    }
}
