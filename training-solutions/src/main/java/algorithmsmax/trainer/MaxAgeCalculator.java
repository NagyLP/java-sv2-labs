package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainer) {

        Trainer trainerMaxAge = trainer.get(0);

        for (Trainer item : trainer) {
            if (item.getAge() > trainerMaxAge.getAge()) {
                trainerMaxAge = item;
            }
        }
        return trainerMaxAge;
    }
}
