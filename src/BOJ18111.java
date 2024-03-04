import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18111 {

    static int blockHand;

    static int[][] field;

    static int blockSum;

    static int targetHeight;

    public static void main(String[] args) throws IOException {
        /**
         * input
         * 3 4 99
         * 0 0 0 0
         * 0 0 0 0
         * 0 0 0 1
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        blockHand = Integer.parseInt(st.nextToken());

        field = new int[n1][n2];
        int minHeight = 256 + 1;

        for (int i = 0; i < n1; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n2; j++) {
                int num = Integer.parseInt(st.nextToken());
                field[i][j] = num;
                blockSum += num;
                if (field[i][j] < minHeight){
                    minHeight = field[i][j];
                }
            }
        }

        targetHeight = minHeight; // 최소높이부터 최대높이까지 모두 시간 재보기.


        int height = 0, timeMin = Integer.MAX_VALUE;

        while (true){
            if (n1 * n2 * targetHeight > blockSum + blockHand){ // 필요량 > 가진 블럭이면 break;
                break;
            }

            int time = 0;

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    if (field[i][j] < targetHeight){
                        time += 1 * (targetHeight - field[i][j]);
                    }
                    else if (field[i][j] > targetHeight){
                        time += 2 * (field[i][j] - targetHeight);
                    }
                }
            }

            if (time <= timeMin){
                height = targetHeight;
                timeMin = time;
            }

            targetHeight++;
        }


        System.out.printf("%d %d", timeMin, height);


    }



}
