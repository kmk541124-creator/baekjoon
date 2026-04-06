import java.io.*;
import java.util.*;

class fourjm{
    @SuppressWarnings("UnnecessaryTemporaryOnConversionFromString")
    public static void main(String[] args) throws Exception {
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 3; i++){
            String str = br.readLine();
            if(str == null) return;
            StringTokenizer st = new StringTokenizer(str, " ");
            if (!st.hasMoreTokens()) return;
            
            listX.add(Integer.parseInt(st.nextToken()));
            listY.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(listX);
        Collections.sort(listY);

        int x4, y4;

        if (listX.get(0).equals(listX.get(1))) {
            x4 = listX.get(2);
        } else {
            x4 = listX.get(0);
        }

        if (listY.get(0).equals(listY.get(1))) {
            y4 = listY.get(2);
        } else {
            y4 = listY.get(0);
        }

        System.out.println(x4 + " " + y4);
    }
}