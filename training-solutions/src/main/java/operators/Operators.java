package operators;

public class Operators {

    public String number = Integer.toBinaryString(5);

    public boolean isEvent(int n) {
        return n % 2 == 0;
    }

    public String getResultOfDivision(int number, int divisor) {
        int result = number / divisor;
        int corporal = number % divisor;
        return "\"" + number +"/"+ corporal +"="+ result +", maradék: "+ corporal +"\"";
    }

    public String isNull(String s) {
        return s == null ?  "null értékű" : "nem null értékű";
    }

    public boolean isEmpty (String s) {
        return s == null || s.equals("");
    }

}
