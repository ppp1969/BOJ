import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        /**
         * 별찍기
         */

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - i - 1; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
