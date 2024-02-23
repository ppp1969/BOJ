import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ1010 { // 왜인지 DP로 풀어도 시간초과


    public static long combination(int N, int M){ // n C m - 오버플로우, 시간 문제 발생
        // 최대공약수 gcd로 분자, 분모를 모두 나눠서 계산

        long answer = 1; // 분자
        long divider = 1; // 분모

        for (int i = 0; i < M; i++) {
            answer *= (N - i); // 분자 내려가면서 더함.
            divider *= (i + 1); // 분모는 올라가면서 더함.

            // 29 C 14일때, 이를 반복하면 -> 분자 : (29*...*15), 분모 : 14!

            long gcd = gcd(answer, divider); // 최대공약수
            answer /= gcd; // 분자/최대공약수 -> 오버플로우 방지
            divider /= gcd; // 분모/최대공약수
        }
        return answer;
    }

    public static long gcd(long a, long b) { // 최대공약수 계산 함수
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int leftSite = 0; int rightSite = 0;

        List<Long> result = new ArrayList<Long>(N);

        for(int i=0; i<N; i++){
            leftSite = scanner.nextInt();
            rightSite = scanner.nextInt();

            Long temp = combination(rightSite, leftSite);


            result.add(temp);


        }

        for (Long num : result ) {
            System.out.println(num);
        }
    }
}
