import java.io.*;
import java.util.*;

public class Solution {
    static int SINGLE_INPUT=0;
    static void solve(int T){
        
    }
    public static void main(String[] args) {
        if(SINGLE_INPUT==1) solve(0);
        else{
            int t = io.nextInt();
            for(int i=1;i<=t;i++){
                solve(i);
                if(i%5==0) io.flush();
            }
        }
        io.flush();
    }
    static IO io = new IO();
}

class IO extends PrintWriter{
    // Inputs
    BufferedReader bf;
    StringTokenizer st;
    String token;
    public IO() {super(new BufferedOutputStream(System.out));
        bf = new BufferedReader(new InputStreamReader(System.in));}
    public IO(InputStream i) {super(new BufferedOutputStream(System.out));
        bf = new BufferedReader(new InputStreamReader(i));}
    public IO(InputStream i, OutputStream o) {super(new BufferedOutputStream(o));
        bf = new BufferedReader(new InputStreamReader(i));}
    public boolean hasMoreTokens() {return peekToken() != null;}
    public int nextInt() {return Integer.parseInt(nextToken());}
    public int[] nextArray(int n) {int[] a = new int[n]; for(int i=0;i<n;i++) a[i]=nextInt(); return a;}
    public int[] nextIntArray(int n) {int[] a = new int[n]; for(int i=0;i<n;i++) a[i]=nextInt(); return a;}
    public void nextIntArray(int[] a) {for(int i=0;i<a.length;i++) a[i]=nextInt();}
    public double nextDouble() {return Double.parseDouble(nextToken());}
    public long nextLong() {return Long.parseLong(nextToken());}
    public long[] nextLongArray(int n) {long[] a = new long[n]; for(int i=0;i<n;i++) a[i]=nextLong(); return a;}
    public String nextString() {return nextToken();}
    public String next() {return nextToken();}
    public String peekToken(){
        if (token == null) 
            try {
            while (st == null || !st.hasMoreTokens()) {
                String line = bf.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }
    public String nextToken(){String ans = peekToken();
        token = null;return ans;}
    // Outputs
    // all output methods in super class Printwriter
    // overloaded some methods
    // Print Int Array
    public void print(int[] a){for(int i:a) System.out.print(i+" ");}
    public void println(int[] a){for(int i:a) System.out.print(i+" "); System.out.println();}
    // Print Long Array
    public void print(long[] a){for(long i:a) System.out.print(i+" ");}
    public void println(long[] a){for(long i:a) System.out.print(i+" "); System.out.println();}
    // Print String Array
    public void print(String[] a){for(String i:a) System.out.print(i+" ");}
    public void println(String[] a){for(String i:a) System.out.print(i+" ");System.out.println();}
}
