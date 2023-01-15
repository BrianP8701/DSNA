// Need these two import statements for Kattio
import java.io.*;
import java.util.StringTokenizer;

public class FencePainting {
    
    // You need this throws IOException
    // O(1)
    public static void main(String[] args) throws IOException {
        // "paint" is the name of the file on this problem
        Kattio test = new Kattio("paint");

        int a = test.nextInt();
        int b = test.nextInt();
        int c = test.nextInt();
        int d = test.nextInt();

        // If they are overlapping, the answer is just greatest minus smallest
        // If they are not overlapping, the answer is b-a + d-c

        int answer = 0;

        // 

        if(a >= c && a <= d || b >= c && b <= d || c >= b && c <= b || d >= a && d <= b){
            int greatest = Math.max(b, d);
            int smallest = Math.min(a, c);
            answer = greatest - smallest;
        } else{
            answer = b - a + d - c;
        }

        test.println(answer);
        // Need to close Kattio!
        test.close();

    }


    // Object we use to read and print
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        public Kattio() { 
            this(System.in, System.out); 
        }
        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        // USACO-style file input
        public Kattio(String problemName) throws IOException {
            super(new FileWriter(problemName + ".out"));
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }

        // returns null if no more input
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) { }
            return null;
        }

        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }
}
