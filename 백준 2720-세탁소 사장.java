import java.io.BufferedReader;
import java.io.InputStreamReader;

class Wash {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null) return;
        int num = Integer.parseInt(str);

        for (int i = 0; i < num; i++) {
            int qcount = 0;
            int dcount = 0;
            int Ncount = 0;
            int pcount = 0;
            String str2 = br.readLine();
            if (str2 == null) return;
            int num2 = Integer.parseInt(str2);

            while (num2 > 0) {
                while (true) {
                    if (qcount * 25 > num2) {
                        qcount -= 1;
                        num2 = num2 - (qcount * 25);
                        break;
                    }
                    qcount++;
                }
                while (true) {
                    if (dcount * 10 > num2) {
                        dcount -= 1;
                        num2 = num2 - (dcount * 10);
                        break;
                    }
                    dcount++;
                }
                while (true) {
                    if (Ncount * 5 > num2) {
                        Ncount -= 1;
                        num2 = num2 - (Ncount * 5);
                        break;
                    }
                    Ncount++;
                }
                while (true) {
                    if (pcount * 1 > num2) {
                        pcount -= 1;
                        num2 = num2 - (pcount * 1);
                        break;
                    }
                    pcount++;
                }
            }
            System.out.println(qcount + " " + dcount + " " + Ncount + " " + pcount);
        }
    }
}