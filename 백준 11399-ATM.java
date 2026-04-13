import java.io.*;
import java.util.*;

class atm{
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        int now = 0;
        if(str == null) return;
        int num = Integer.parseInt(str);
        String str1 = br.readLine();
        if(str1 == null) return;
        StringTokenizer st = new StringTokenizer(str1, " ");
        for (int i = 0; i < num; i++) {
            if (!st.hasMoreTokens()) return;
            int num1 = Integer.parseInt(st.nextToken());
            arr.add(num1);
        }
        Collections.sort(arr);
        for(int i : arr){
            sum += i + now;
            now += i;
        }
        System.out.println(sum);
    }
}