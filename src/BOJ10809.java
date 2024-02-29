import java.io.IOException;
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        // baekjoon
        // -> 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
        // 있다면 위치, 없다면 -1,

        int[] indexArr = new int[26];

        // 기본값 지정.
        for (int i = 0; i < 26; i++) {
            indexArr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i)-'a';

            if (indexArr[index] != -1){continue;}
            indexArr[index] = i;
        }

        for (int i: indexArr) {
            System.out.printf("%d ", i);
        }


    }
}
