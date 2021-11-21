package introexceptiontrycatchtrace;

import java.util.*;

public class Winner {

    private List<String> players = new ArrayList<>(Arrays.asList("Mata Hari", "Lucky Luke", "Rózsaszín Párduc", null));

    public List<String> getPlayers() {
        return players;
    }

    public void addPerson (String name) {
        players.add(name);
    }

    public String getWinner() {
        Random random = new Random();
        int randomIndex = random.nextInt(players.size()+1);
        return players.get(randomIndex).toUpperCase();
    }
}
