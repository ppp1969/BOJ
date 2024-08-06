import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] num = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int key = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < count; i++) {
            if(Integer.parseInt(st.nextToken()) == key){ result++; }
        }

        bw.write(result+"");
        bw.close();
        br.close();
    }
}
