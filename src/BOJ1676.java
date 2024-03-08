import java.util.Scanner;

public class BOJ1676 {
    public static void main(String[] args) {
        // 2, 5, 10을 줄이면서 개수세기.

        // 2, 5, 10, 20, 30, 40, 50 등...?

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int d_2 = 0;
        int d_5 = 0;

        for (int i = 1; i < N + 1; i++) {
            // i가 2, 5 등으로 나눠지면, 2와 5에 약수 개수 추가. 이후 2와 5 중 최소값만큼 0 생성됨.
            int temp = i;

            while (true){
                if (temp % 2 == 0){
                    d_2++;
                    temp /= 2;
                }
                else if (temp % 5 == 0){
                    d_5++;
                    temp /= 5;
                }
                else {
                    break;
                }
            }
        }

        if (d_5 < d_2){
            System.out.println(d_5);
        }
        else {
            System.out.println(d_2);
        }
    }
}
