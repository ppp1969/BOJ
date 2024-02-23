import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<Integer> array = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            if (temp < X){
                array.add(temp);
            }
        }

        for (int num:
             array) {
            System.out.printf("%d ", num);
        }





    }
}
