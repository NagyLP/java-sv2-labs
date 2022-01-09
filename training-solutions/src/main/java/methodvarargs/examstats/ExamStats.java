package methodvarargs.examstats;

public class ExamStats {

    private final int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPerecent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        double limitPoint = maxPoints * limitInPerecent / 100d;
        int volumenOfTopGrades = 0;
        for (int point : results) {
            if (point > limitPoint) {
                volumenOfTopGrades++;
            }
        }
        return volumenOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        double limitPoint = maxPoints * limitInPercent / 100d;
        for (int point : results) {
            if (point < limitPoint) {
                return true;
            }
        }
        return false;
    }
}

//    private final double maxPoints;

//    public ExamStats(int maxPoints) {
//        this.maxPoints = maxPoints;
//    }
//
//    public int getNumberOfTopGrades(int limitInPercent, int... results) {
//        if (results == null || results.length == 0) {
//            throw new IllegalArgumentException("Number of results must not be empty!");
//        }
//        int numberOfTop = 0;
//        for (int point : results) {
//            if (point > (1.0 * limitInPercent / 100) * maxPoints) {
//                numberOfTop++;
//            }
//        }
//        return numberOfTop;
//    }
//
//    public boolean hasAnyFailed(int limitInPercent, int... results) {
//        if (results == null || results.length == 0) {
//            throw new IllegalArgumentException("Number of results must not be empty!");
//        }
//        for (int point : results) {
//            if (point < (1.0 * limitInPercent / 100) * maxPoints) {
//                return true;
//            }
//        }
//        return false;
//    }
//}