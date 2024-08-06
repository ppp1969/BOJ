import java.io.*;
import java.util.StringTokenizer;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null){
            if(line.trim().isEmpty()){
                continue;
            }

            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = A + B;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
