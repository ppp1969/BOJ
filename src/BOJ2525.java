import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        // hour minute
        // cookingTime

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int cookingTime = scanner.nextInt();

        minute += cookingTime;

        while(minute >= 60){
            minute -= 60;
            hour++;
        }

        if (hour >=24){hour -= 24;}
        System.out.printf("%d %d", hour, minute);

    }
}
