import java.io.*;
import java.util.StringTokenizer;

public class BOJ25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalPrice = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < totalCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            result += price * count;
        }

        if (result == totalPrice){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");

        }

    }
}
