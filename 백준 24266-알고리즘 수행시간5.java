import java.io.*;

class algorimgemfive{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        long num = Long.parseLong(str);

        System.out.println(num*num*num);
        System.out.println(3);
    }
}
