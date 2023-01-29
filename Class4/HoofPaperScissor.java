import java.io.*;
import java.util.StringTokenizer;

public class HoofPaperScissor {
    public static void main(String[] args) {
        Kattio test = new Kattio("hps");

        int N = test.nextInt();

        for(int i = 0; i < N; i++){
            int a = test.nextInt();
            int b = test.nextInt();
        }
    }

    public static boolean win(int a, int b){
        if()
    }



    // Is just an object for us to read data from USACO
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
