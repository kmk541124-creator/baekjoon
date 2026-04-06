import java.io.*;

class algorimgemfour{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        long n = Long.parseLong(str);
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
