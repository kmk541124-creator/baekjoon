import java.io.*;
class lostclose{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subtractionGroups = br.readLine().split("-");

        int reulst = Integer.MAX_VALUE;

        for (String subtractionGroup : subtractionGroups) {
            int sumtemp = 0;
            String[] additionGroups = subtractionGroup.split("\\+");
            for (String numstr : additionGroups) {
                sumtemp += Integer.parseInt(numstr);
            }
            if(reulst == Integer.MAX_VALUE){
                reulst = sumtemp;
            }
            else{
                reulst -= sumtemp;
            }
        }

        System.out.println(reulst);
    }
}
