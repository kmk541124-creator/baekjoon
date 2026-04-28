import java.io.*;
import java.util.*;

class numbersort{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<Integer.parseInt(str); i++){
            String str1 = br.readLine();
            int num = Integer.parseInt(str1);
            arr.add(num);
        }
        Collections.sort(arr);
        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}