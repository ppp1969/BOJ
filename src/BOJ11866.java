import java.util.LinkedList;
import java.util.Scanner;

public class BOJ11866 {
    public static void main(String[] args) {
        /**
         * P : 요세푸스 문제.
         */

        // 7 3 입력

        // 7개까지 리스트로 연결하고. 이후 해당 번호마다 자르기.

        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int interval = scanner.nextInt() - 1;
        int[] result = new int[num];

        for (int i = 1; i < num + 1; i++) {
            list.add(i);
        }


        int index = 0;
        int size = num;
        for (int i = 0; i < num; i++) {
            index = (index + interval) % size;
            result[i] = list.remove(index);
            size--;
        }

        // <3, 6, 2, 7, 5, 1, 4>

        System.out.printf("<");
        for (int i = 0; i < num; i++) {
            if (i == num - 1){
                System.out.printf("%d", result[i]);
            }
            else {
                System.out.printf("%d, ", result[i]);
            }


        }
        System.out.printf(">");
    }
}
