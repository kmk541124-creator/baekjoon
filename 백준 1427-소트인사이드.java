import java.io.*;
import java.util.*;

class sortinside{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            arr.add(str.charAt(i) - '0');
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
}