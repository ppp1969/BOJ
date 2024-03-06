import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        // 3 새로운 평균 (점수/M*100로 최신화)
        //40 80 60

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        double maxScore = 0;

        int[] preScore = new int[count];
        double[] postScore = new double[count];

        double result = 0;

        for (int i = 0; i < count; i++) {
            preScore[i] = scanner.nextInt();
            if (maxScore < preScore[i]){
                maxScore = preScore[i];
            }
        }

        for (int i = 0; i < count; i++) {
            postScore[i] =  (double) preScore[i] / maxScore * 100;
            result += postScore[i];
        }

        System.out.println(result / count);

    }
}
