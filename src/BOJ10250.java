import java.io.*;
import java.util.StringTokenizer;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        /**
         * @Author J
         * @Date 2024-02-28
         *
         * ACM호텔 - 101, 201, 301 ... 102, 202, 302 순으로 빈방이 찬다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCount = Integer.parseInt(br.readLine());
        int[] result2 = new int[testCount];

        for (int i = 0; i < testCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int floor = Integer.parseInt(st.nextToken());
            int roomPerFloor = Integer.parseInt(st.nextToken());

            // 나머지 -> 층, 몫 + 1 -> 호수
            int customerNumber = Integer.parseInt(st.nextToken());

            // 99 + 99 호. 99 + 0 + 9 호
            int resultfloor = (customerNumber-1) % floor + 1;
            int roomNumber = (customerNumber-1) / floor + 1;

            String result = "";

            result += resultfloor;

            if (roomNumber < 10){ result += "0";}
            result += roomNumber;

            result2[i] = Integer.parseInt(result);
        }

        br.close();

        for (int i = 0; i < testCount; i++) {
            System.out.println(result2[i]);
        }

    }
}
