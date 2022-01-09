package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        setWomenMarriedName(woman, man.getName());
        addRegisterDate(woman, man);
    }

    private void setWomenMarriedName(Woman woman, String name) {
        String[] namePieces = name.split(" ");
        String husbandName = namePieces[0];
        woman.setName(husbandName + "-" + woman.getName());
    }

    private void addRegisterDate(Woman woman, Man man) {
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }
}
