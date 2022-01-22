package collectionsset;

import java.util.*;

public class QuestionGame {

    private final List<RightAnswer> rightAnswers = new ArrayList<>();
    private static final int VOLUME_OF_WINNERS = 5;
    private final Random random = new Random();
    private final Set<String> winnersNames = new HashSet<>();


    public List<RightAnswer> getRightAnswers() {
        return rightAnswers;
    }

    public Set<String> drawWinners() {
        if (rightAnswers == null) {
            throw new NullPointerException("Rightanswer list is null.");
        }
        while (winnersNames.size() < VOLUME_OF_WINNERS && !rightAnswers.isEmpty()) {
            int index = random.nextInt(rightAnswers.size());
            winnersNames.add(rightAnswers.get(index).getNameOfSolver());
            rightAnswers.remove(index);
        }
        if (winnersNames.size() == VOLUME_OF_WINNERS) {
            return winnersNames;
        }
        throw new IllegalArgumentException("Not enough right answers!");
    }

//    public Set<String> drawWinners() {
//        Set<String> winnerNames = new HashSet<>();
//        Random random = new Random();
//        while (winnerNames.size() != 5) {
//            if (rightAnswers.size() == 0) {
//                throw new IllegalArgumentException("Not enough right answers!");
//            }
//            int index = random.nextInt(rightAnswers.size());
//            winnerNames.add(rightAnswers.get(index).getNameOfSolver());
//            rightAnswers.remove(index);
//        }
//        return winnerNames;
}
