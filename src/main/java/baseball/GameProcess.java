package baseball;

import java.util.List;
import java.util.Objects;

public class GameProcess {
    public static void gameStart() {

    }

    public static Integer countStrike(List<Integer> playerNumber, List<Integer> computerNumber) {
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            if (Objects.equals(playerNumber.get(i), computerNumber.get(i))) {
                strike += 1;
            }
        }

        return strike;
    }

    public static Integer countBall(List<Integer> playerNumber, List<Integer> computerNumber) {
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (!Objects.equals(playerNumber.get(i), computerNumber.get(i)) && computerNumber.contains(playerNumber.get(i))) {
                ball += 1;
            }
        }

        return ball;
    }
}
