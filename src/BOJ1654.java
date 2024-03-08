import java.util.Scanner;

public class BOJ1654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt(); // 가지고 있는 랜선 개수
        int N = scanner.nextInt(); // 필요한 랜선 개수

        int sum = 0;
        int avg = 0;

        int[] cableLenth = new int[K];

        for (int i = 0; i < K; i++) {
            int temp = scanner.nextInt();
            cableLenth[i] = temp;
            sum += temp;
        }

        avg = sum / N * 2;

        for (int i = avg; i > 0 ; i--) {
            // 현재 최대라고 가정한 길이로 개수가 나오는지 체크.
            int count = 0;

            for (int j = 0; j < K; j++) {
                // 케이블 하나 뽑아와서
                int tempCable = cableLenth[j];

                // 해당 케이블에서 최대 count 구하기.
                while (tempCable >= i){
                    count++;
                    tempCable -= i;
                }

            }

            if (count >= N){
                System.out.println(i);
                break;
            }

        }




    }
}
