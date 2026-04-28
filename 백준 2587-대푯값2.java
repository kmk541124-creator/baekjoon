import java.io.*;
import java.util.*;

class leadernumber{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5; i++){
            String str = br.readLine();
            int num = Integer.parseInt(str);
            arr.add(num);
        }
        Collections.sort(arr);
        int sum = 0;
        
        for(int i = 0; i<arr.size(); i++){
            sum += arr.get(i);
        }
        System.out.println(sum/arr.size());
        System.out.println(arr.get(2));
    }
}