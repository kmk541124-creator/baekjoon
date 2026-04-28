import java.io.*;
import java.util.*;

class cutline{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int num = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1," ");
        for(int i = 0; i<num; i++){
            int num3 = Integer.parseInt(st1.nextToken());
            arr.add(num3);
        }
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr.get(cut-1));
    }
}