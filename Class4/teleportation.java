import java.io.*;
import java.util.StringTokenizer;

public class teleportation {
    // You always need  throws IOException  at end of main method
    public static void main(String[] args) throws IOException{
        Kattio test = new Kattio("teleport");

        int a = test.nextInt(), b = test.nextInt(), x = test.nextInt(), y = test.nextInt();

        int A = Math.abs(a-b);

        int B = Math.abs(a-x) + Math.abs(y-b);

        int C = Math.abs(a-y) + Math.abs(x-b);

        test.println(Math.min(Math.min(A, B), C));

        // Don't forget this!
        test.close();
    }

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
