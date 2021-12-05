package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private final List<FamilyMember> familyMembersList;

    public Family() {
        this.familyMembersList = new ArrayList<>();
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> ageOfNameList = new ArrayList<>();

        for (FamilyMember item : familyMembersList) {
            if (item.getName().contains(name))
                ageOfNameList.add(item.getAge());
        }
        return ageOfNameList;
    }


    public void addFamilyMember(FamilyMember familyMember) {
        familyMembersList.add(familyMember);
    }

    public List<FamilyMember> getFamilyMembersList() {
        return familyMembersList;
    }
}
