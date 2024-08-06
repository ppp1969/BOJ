import java.io.*;
import java.util.StringTokenizer;

public class BOJ11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i < count + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = A + B;
            // Case #1: 1 + 1 = 2

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + result + "\n");
        }
        bw.flush();
    }
}
