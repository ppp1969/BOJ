import java.util.Scanner;

/**
 * gold V - 1083 소트
 * 2024.2.14
 * @author J
 */
public class BOJ1083 {

    public static int rangeMax(int index, int range,int[] arr){ // 현재위치, range, arr
        int localMax = index; // index값

        for (int i=1; i <= range && index + i < arr.length; i++){
            if (arr[localMax] < arr[index+i]){
                localMax = index+i;
            }
        }


        return localMax; // index 리턴 : 현재값이 최대값이면, sorting 횟수 버리지않고 넘어감
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrsize = scanner.nextInt();
        int[] arr = new int[arrsize];

        if (arrsize < 1){return;}

        // 배열에 입력받기.
        for (int i=0; i<arrsize; i++){
            arr[i] = scanner.nextInt();
        }

        int sortCount = scanner.nextInt();


        // 소팅횟수 안에서 range에 맞게 구하고, range내 최대값 앞으로 가져오기.
        // 최대값를 앞으로 가져왔다면, 2번째 위치에서 range만큼 최대값 가져오기!

        for (int i=0; i<arrsize; i++){
            int range = sortCount;  // 1만큼이니, 2칸 확보


            if (sortCount == 0){
                break;
            }

            // 범위만큼 재서 localMax위치 확인
            int localMaxIndex = rangeMax(i,range,arr); // i는 현재 탐색 시작 위치

            // localMax가 자신이라면, pass
            if(localMaxIndex == i){
                continue;
            }

            // localMax가 자신이 아니라면, localMax를 맨 앞으로 가져오는 교환.
            // localMax부터, i까지 하나씩 버블 교환
            int temp;
            for (int j = localMaxIndex; j > i; j--) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                sortCount--;
                if(sortCount == 0){
                    break;
                }

        }

    }
        for (int num: arr) {
            System.out.printf("%d ", num );
        }

    }
}
