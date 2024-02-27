import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;
        int result = 0;
        int temp = 0;
        int count = 0;


        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 == num2){
            temp = num1;
            count++;
        }

        if (num2 == num3){
            temp = num2;
            count++;
        }

        if (num3 == num1){
            temp = num1;
            count++;
        }

        switch (count){
            case 3: // 모두 같은 경우
                result = 10000 + temp * 1000;
                break;
            case 2:
                break;
            case 1:
                result = 1000 + temp * 100;
                break;
            case 0:
                result = num1 * 100;

                if (result < num2 * 100){result = num2 * 100;}
                if (result < num3 * 100){result = num3 * 100;}
                break;
        }

        System.out.println(result);

    }


}
