import java.io.*;
import java.util.*;;

class treecut{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str == null) return;
        StringTokenizer st = new StringTokenizer(str," ");
        int num = Integer.parseInt(st.nextToken());
        long num1 = Integer.parseInt(st.nextToken());
        long[] arr = new long[num];
        long maxHeight = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            maxHeight = Math.max(maxHeight, arr[i]);
        }
        
        long lo = 0, hi = maxHeight, result = 0;

        while(lo<=hi){
            long mid = (lo + hi) / 2;
            long sum = 0;

            for (long tree : arr){
                if (tree > mid) sum += tree - mid;
            }

            if(sum >= num1){
                result = mid;
                lo = mid +1;
            }
            else{
                hi = mid -1;
            }
        }
        System.out.println(result);
    }
}