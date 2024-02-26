import java.util.Scanner;

public class BOJ18108 {
    public static void main(String[] args) {
        // 2541 -> 1998 년
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();

        int year_dif = 2541 - 1998;

        System.out.println(num - year_dif);
    }
}
