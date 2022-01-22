package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private final String nameOfSolver;


    public RightAnswer(String nameOfSolver) {
        this.nameOfSolver = nameOfSolver;
    }

    public String getNameOfSolver() {
        return nameOfSolver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightAnswer that = (RightAnswer) o;
        return nameOfSolver.equals(that.nameOfSolver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSolver);
    }

    //    @Override
//    public boolean equals(Object other) {
//        if (this == other) {
//            return true;
//        }
//        if (other == null || getClass() != other.getClass()) {
//            return false;
//        }
//        RightAnswer rightAnswer = (RightAnswer) other;
//        return nameOfSolver.equals(rightAnswer.nameOfSolver);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nameOfSolver);
//    }
}
