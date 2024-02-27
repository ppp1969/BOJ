import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) { // 2 * 1 = 2
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }
    }
}
