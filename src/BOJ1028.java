import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1028 {

    public static int findMaxDiamond(int indexRow, int indexCol, int[][] Num){ // 한바퀴 회전만
        if (Num[indexRow][indexCol] == 0){ return 0;}
        else if (Num[indexRow][indexCol] == 1) {
            int startX = indexRow + 1;
            int startY = indexCol - 1;
            int size = 1;

            // 시작지점과 사이즈 찾기.
            while (Num[startX][startY] == 1){
                startX++;
                startY--;
                size++;
            }
            startX--;
            startY--;

            // 한바퀴 돌려보기.
            // 성공시 최대 사이즈 리턴
            // 실패시 start 한칸씩 되돌리고, size-- 이후 다시 돌리기.

        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        //5 5
        //01100
        //01011
        //11111
        //01111
        //11111

        // 행렬에 상하좌우+1 씩 크기로 여유공간 만들기!

        int[][] num = new int[row+2][col+2];
        for (int i = 1; i < row + 1; i++) {
            String str = br.readLine();
            for (int j = 1; j < col + 1; j++) {
                num[i][j] = Character.getNumericValue(str.charAt(j-1));
            }
        }

        for (int[] a: num) {
            for (int b: a) {
                System.out.print(b);
            }
            System.out.println();
        }


    }
}
