import java.io.*;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        // 9개 숫자중 최대값과 index

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int maxIndex = 0;
        int temp;
        for (int i = 1; i <= 9; i++) {
            if(max < (temp = Integer.parseInt(br.readLine()))){
                max = temp;
                maxIndex = i;
            }
        }
        bw.write(max+"\n"+maxIndex);
        bw.close();
        br.close();
    }

}
