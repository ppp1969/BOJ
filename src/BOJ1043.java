import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1043 {
    public static void main(String[] args) throws IOException {
        /**
         * gold IV - 1043 거짓말
         * 2024.2.23
         * @author J
         *
         * 입력 예시:
         * 4 5 (인원, 파티 정보)
         * 1 1 (진실 아는 사람 수, 번호)
         * 1 1 (파티 정보 명수, 명단)
         * 1 2
         * 1 3
         * 1 4
         * 2 4 1
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numPeople = Integer.parseInt(st.nextToken());
        int numParty = Integer.parseInt(st.nextToken());



        st = new StringTokenizer(br.readLine());

        int numTrue = Integer.parseInt(st.nextToken()); // 3명

        if (numTrue == 0){
            System.out.println(numParty);
            return;
        }

        List<Integer> truePeople = new ArrayList<>();

        while (st.hasMoreTokens()) {
            truePeople.add(Integer.parseInt(st.nextToken()));
        }


        List<List<Integer>> partys = new ArrayList<>();

        for (int i = 0; i < numParty; i++) {
            st = new StringTokenizer(br.readLine());
            int partySize = Integer.parseInt(st.nextToken());
            List<Integer> partyName = new ArrayList<>();
            for (int j = 0; j < partySize; j++) {
                partyName.add(Integer.parseInt(st.nextToken()));
            }
            partys.add(partyName);
        }



        while (true) {
            boolean isUpdated = false;
            List<Integer> newTruePeople = new ArrayList<>();

            for (int i = 0; i < partys.size(); i++) {
                for (int truePerson : truePeople) {
                    if (partys.get(i).contains(truePerson)) {
                        for (int person : partys.get(i)) {
                            if (!truePeople.contains(person) && !newTruePeople.contains(person)) {
                                newTruePeople.add(person);
                                isUpdated = true;
                            }
                        }
                        partys.remove(i--);
                        break;
                    }
                }
            }

            if (!isUpdated) break;
            truePeople.addAll(newTruePeople);
        }

        // 결과 출력
        System.out.println(partys.size());

    }
}