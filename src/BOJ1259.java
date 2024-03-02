import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        /**
         * 입력 -> yes or no
         * 121
         * 1231
         * 12421
         * 0
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Boolean> result = new LinkedList<>();

        while (true){

            boolean isPalin = true;
            String str = br.readLine();
            if (str.equals("0")){
                break;
            }

            String[] num = str.split("");
            Deque<String> numList = new ArrayDeque<>();

            for (String n: num) {
                numList.add(n);
            }

            while (numList.size() > 1){
                if (!numList.removeFirst().equals(numList.removeLast())){
                    isPalin = false;
                    break;
                }
            }

            result.add(isPalin);
        }

        for (boolean r: result) {
            if (r){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }
}
