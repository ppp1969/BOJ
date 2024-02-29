import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = st.countTokens();
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] asc = {1,2,3,4,5,6,7,8};
        int[] des = {8,7,6,5,4,3,2,1};
        boolean ascFlag = false;
        boolean desFlag = false;

        for (int i = 0; i < count; i++) {
            if (asc[i] != num[i]){
                ascFlag = false;
                break;
            }
            ascFlag = true;
        }

        for (int i = 0; i < count; i++) {
            if (des[i] != num[i]){
                desFlag = false;
                break;
            }
            desFlag = true;
        }

        if (ascFlag){
            System.out.println("ascending");
        } else if (desFlag) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }

    }
}
