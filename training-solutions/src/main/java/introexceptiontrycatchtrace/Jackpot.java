package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {
        Winner winner = new Winner();

        try {
            System.out.println("A nyertes: " + winner.getWinner());
        } catch (NullPointerException npe) {
            System.out.println("Nem létező figura a nyertes.");
        }
    }

}
