import java.io.*;

public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] scoreAll = new int[count];

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            String[] arr = str.split("");

            //OOXXOXXOOO
            int stack = 1;
            int score = 0;
            for (String s: arr) {
                if (s.equals("O")){
                    score += stack;
                    stack++;
                } else if (s.equals("X")) {
                    stack = 1;
                }
            }

            scoreAll[i] = score;
        }

        for (int sa: scoreAll) {
            System.out.println(sa);
        }
    }
}
