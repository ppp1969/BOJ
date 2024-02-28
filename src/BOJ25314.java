import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        /**
         * @Author J
         * @Date 2024.02.28
         *
         * 4 -> long int
         * 8 -> long long int
         * 12 -> long long long int ...
         *
         * 4마다 long 써주기
         */

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        count /= 4;

        String str = "";

        for (int i = 0; i < count; i++) {
            str += "long ";
        }

        System.out.println(str + "int");
    }
}
