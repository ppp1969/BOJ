import java.io.*;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int result = 0;

        Stack<Integer> istack = new Stack<>();

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0){
                istack.pop();
            }
            else {
                istack.push(num);
            }
        }

        int size = istack.size();

        for (int i = 0; i < size; i++) {
            result += istack.pop();
        }

        System.out.println(result);

    }
}
