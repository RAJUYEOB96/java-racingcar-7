package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashMap;
import java.util.Map;


public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String [] carsName = Console.readLine().trim().split(",");

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryNum = Console.readLine();
        int intTryNum = Integer.parseInt(tryNum);

        Map<String,Integer> carsDistance = new HashMap<>();

        for (int i = 0; i < carsName.length; i++) {
            String name = carsName[i];
            carsDistance.put(name,0);
        }

        for (int i = 0; i < intTryNum; i++) {
            System.out.println(i + 1 + "th try result");
            for (String name : carsName) {
                int randomNum = Randoms.pickNumberInRange(0, 9);
                if (randomNum >= 4){
                    carsDistance.put(name, carsDistance.get(name) + 1);
                }
                System.out.println(name + " : " + "-".repeat(carsDistance.get(name)));
            }
            System.out.println("\n");
        }

    }

}

