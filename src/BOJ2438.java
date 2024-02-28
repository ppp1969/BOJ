import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
