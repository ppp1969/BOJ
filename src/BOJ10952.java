import java.io.*;
import java.util.StringTokenizer;

public class BOJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = 0;
            if(A == 0 && B == 0){
                break;
            }

            result = A + B;
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
