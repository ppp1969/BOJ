import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2475 {
    public static void main(String[] args) throws IOException {
        int count = 5;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr = str.split(" ");

        for (String a: arr) {
            sum += Integer.parseInt(a) * Integer.parseInt(a);
        }

        sum %= 10;

        System.out.println(sum);
    }
}
