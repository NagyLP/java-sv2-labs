package stringbasic;

public class Person {

    private String name;
    private String email;
    private String TAJ;
    private String bankAccountNumber;
    private String phoneNumber;

    public Person(String name, String email, String TAJ, String bankAccountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.TAJ = TAJ;
        this.bankAccountNumber = bankAccountNumber;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTAJ(String TAJ) {
        this.TAJ = TAJ;
    }
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getTAJ() {
        return TAJ;
    }
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
