import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {

    // 8×8 크기의 체스판으로 잘라낸 후, 다시 칠할거다. -> 최소값.
    static char[][] board;
    static int x;
    static int y;

    public static int checkChess(int startX, int startY){
        int resultWB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int temp = (i + j) % 2;

                if (temp == 0){ // 0번위치에 W면 정답
                    if (board[startX + i][startY + j] == 'B'){
                        resultWB++;
                    }
                }
                else {
                    if (board[startX + i][startY + j] == 'W'){
                        resultWB++;
                    }
                }
            }
        }

        int resultBW = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int temp = (i + j) % 2;

                if (temp == 0){ // 0번위치에 W면 정답
                    if (board[startX + i][startY + j] == 'W'){
                        resultBW++;
                    }
                }
                else {
                    if (board[startX + i][startY + j] == 'B'){
                        resultBW++;
                    }
                }
            }
        }

        return Math.min(resultBW, resultWB);

    }

    public static void main(String[] args) throws IOException {
        // 10 13 입력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        board = new char[x][y];

        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < y; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        // board에서 8x8만큼 추출해서 반복돌려보고 최저값 저장하기.
        int min = Integer.MAX_VALUE;

        // 시작좌표를 하나씩 늘려서, x-8까지 반복하면 됨.
        for (int i = 0; i <= x-8; i++) {
            for (int j = 0; j <= y-8; j++) {
                int temp = checkChess(i,j);
                min = Math.min(min,temp);
            }
        }

        System.out.println(min);





    }
}
