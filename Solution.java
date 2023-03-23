import java.util.*;
import java.io.*;
import java.util.*;

public class Solution {
    static int SINGLE_INPUT=0;
    static void solve(int testcase){
        
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
    BufferedReader bf;
    StringTokenizer st;
    String token;
    public IO() {
        super(new BufferedOutputStream(System.out));
        bf = new BufferedReader(new InputStreamReader(System.in));
    }
    public IO(InputStream i) {
        super(new BufferedOutputStream(System.out));
        bf = new BufferedReader(new InputStreamReader(i));
    }
    public IO(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        bf = new BufferedReader(new InputStreamReader(i));
    }
    public boolean hasMoreTokens() {
        return peekToken() != null;
    }
    public int nextInt() {
        return Integer.parseInt(nextToken());
    }
    public int[] nextArray(int n) {
        int[] a = new int[n]; 
        for(int i=0;i<n;i++) 
            a[i]=nextInt(); 
        return a;
    }
    public int[] nextIntArray(int n) {
        int[] a = new int[n]; 
        for(int i=0;i<n;i++) 
            a[i]=nextInt(); 
        return a;
    }
    public void nextIntArray(int[] a) {
        for(int i=0;i<a.length;i++) a[i]=nextInt();
    }
    public double nextDouble() {
        return Double.parseDouble(nextToken());
    }
    public long nextLong() {
        return Long.parseLong(nextToken());
    }
    public long[] nextLongArray(int n) {
        long[] a = new long[n]; 
        for(int i=0;i<n;i++) 
            a[i]=nextLong(); 
        return a;
    }
    public String nextString() {
        return nextToken();
    }
    public String next() {
        return nextToken();
    }
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
    public String nextToken(){
        String ans = peekToken(); token = null;
        return ans;
    }
    public void print(int[] a){
        for(int i:a) System.out.print(i+" ");
    }
    public void println(int[] a){
        for(int i:a) System.out.print(i+" "); System.out.println();
    }
    public void print(long[] a){
        for(long i:a) System.out.print(i+" ");
    }
    public void println(long[] a){
        for(long i:a) System.out.print(i+" "); System.out.println();
    }
    public void print(String[] a){
        for(String i:a) System.out.print(i+" ");
    }
    public void println(String[] a){
        for(String i:a) System.out.print(i+" ");System.out.println();
    }
}

class Util{
    public boolean[] getIsPrimeSieve(){
        int n = 1001000;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            int j=2*i;
            while(j<n){
                prime[j]=false;
                j+=i;
            }
        }
        return prime;
    }
    public boolean[] getIsPrimeSieve(int n){
        n++;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            int j=2*i;
            while(j<n){
                prime[j]=false;
                j+=i;
            }
        }
        return prime;
    }
    public boolean checkPallen(String s){
        for(int i=0;i<s.length();i++) if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return true;
    }
    public HashMap<Integer, Integer> getOccuranceCountMap(int[] arr){
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i:arr) count.put(i, count.getOrDefault(i, 0)+1);
        return count;
    }
    public int[] getFrequencyArray(String s){
        int n = 26;
        for(char c:s.toCharArray()) if(!Character.isLowerCase(c))        {System.out.println("Util.getFrequencyArray(String s) : String is not in all lowercase.");
        throw new Error("Util.getFrequencyArray(String s) : String is not in all lowercase.");
                                                                        }
        int[] freq = new int[26];
        for(char c:s.toCharArray()) freq[c-'a']++;
        return freq;
    }
}
