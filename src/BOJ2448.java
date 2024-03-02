import java.util.Scanner;

public class BOJ2448 {
    /**
     * 시간초과 발생!!
     *
     * 배열을 전체 표준 입출력시, 한번에 하나씩 출력하여 소모시간 폭증
     * => 스트링 빌더를 활용해 스트링으로 변환 후 한번만 출력!
     */

    public static void printStar(char[][] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void execStar(int x, int y, int N, char[][] Arr){
        if (N == 3){
            Arr[x][y] = '*';

            Arr[x+1][y-1] = '*';
            Arr[x+1][y+1] = '*';

            Arr[x+2][y-2] = '*';
            Arr[x+2][y-1] = '*';
            Arr[x+2][y] = '*';
            Arr[x+2][y+1] = '*';
            Arr[x+2][y+2] = '*';
        }
        else {
            execStar(x,y,N/2,Arr);

            execStar(x + N/2,y + N/2,N/2, Arr);

            execStar(x + N/2,y - N/2,N/2, Arr);
        }
    }

    public static void main(String[] args) {
        /**
         * 별 찍기 - 11 gold IV
         * input : 3,6,12,24,48(N은 항상 3×2k) -> 2^k 주목 -> n : 0, 1, 2, 3, 4 ...
         */

        // N을 입력받고 48 * 48 배열을 생성하고 꼭짓점을 통해서 아래 그리기.

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        char[][] triArr = new char[N][2 * N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                triArr[i][j] = ' ';
            }
        }

        // [0][n-1] -> 1번째
        // [n/2][n/2-1], [n/2][n/2-1+n] -> 대가리 찾기.

        execStar(0, N-1, N, triArr);

        printStar(triArr);


    }
}
