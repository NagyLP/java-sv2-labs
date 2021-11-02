package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {

        if (title != null && !title.equals("")) {
            return
                    title.getTitle()
                        .concat(" ").concat(givenName)
                        .concat(" ").concat(middleName)
                        .concat(" ").concat(familyName);
        } else if (middleName !=null && !middleName.equals("")){
            return
                    givenName
                        .concat(" ").concat(middleName)
                        .concat(" ").concat(familyName);
        } else { return givenName + familyName;
        }
    }

    public String concatNameHungarianStyle() {

        if (title != null && !title.equals("")) {
            return
                title.getTitle()
                + " " + familyName
                + " " + middleName
                + " " + givenName;
        } else if (middleName !=null && !middleName.equals("")){
            return
                familyName
                + " " + middleName
                + " " + givenName;
        } else { return familyName + givenName;
        }
    }
}
