import java.io.*;
import java.util.StringTokenizer;

public class BOJ10950 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 버퍼 사용해서 해결
         * 5
         * 1 1
         * 2 3
         * 3 4
         * 9 8
         * 5 2
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            String s = br.readLine();

            StringTokenizer st = new StringTokenizer(s, " ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            result[i] = num1 + num2;
        }

        for (int r:
             result) {
            System.out.println(r);
        }


    }

}

