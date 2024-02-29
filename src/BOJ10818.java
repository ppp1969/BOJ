import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int max = -1_000_000;
        int min = 1_000_000;
        int temp = 0;
        for (int i = 0; i < count; i++) {
            temp = scanner.nextInt();

            if (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }
        }

        System.out.printf("%d %d", min, max);
    }
}
