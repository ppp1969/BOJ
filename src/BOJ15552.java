import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()); // 개수 입력받기
        int result;
        int A, B;
        StringTokenizer st;
        for (int i = 0; i < num ; i++) {
            // 1줄 읽어서, stringTokeniger 사용
            st = new StringTokenizer(br.readLine());
            // 토큰 하나는 무조건 존재
            A = Integer.parseInt(st.nextToken());

            // 토큰이 2개라면 합
            if(st.hasMoreTokens()){
                B = Integer.parseInt(st.nextToken());
                result = A + B;
            }
            else {
                result = A;
            }

            bw.write(result + "\n");
        }
        // flush를 통해서 한번에 출력하는게 핵심
        bw.flush();
    }
}
