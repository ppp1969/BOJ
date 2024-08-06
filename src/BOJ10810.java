import java.io.*;
import java.util.StringTokenizer;

public class BOJ10810 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken()); // 바구니 사이즈
        int inputCount = Integer.parseInt(st.nextToken()); // 넣는 횟수

        // 바구니 start, end, 넣는숫자
        int[] baguni = new int[size];
        int start, end, num;
        for (int i = 0; i < inputCount; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());

            for (int j = start-1; j < end; j++) {
                baguni[j] = num;
            }

        }

        for (int i = 0; i < size; i++) {
            bw.write(baguni[i]+"");
            if(i != size-1){bw.write(" ");}
        }
        bw.close();
        br.close();
    }
}
