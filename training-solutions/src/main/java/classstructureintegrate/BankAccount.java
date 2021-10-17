package classstructureintegrate;

public class BankAccount {

    private String accountNumbeR;
    private String owneR;
    private int balancE;

    public BankAccount (String accountNumber, String owner, int balance) {
        this.accountNumbeR = accountNumber;
        this.owneR = owner;
        this.balancE = balance;
    }
    public String getInfo() {return owneR + " (" +accountNumbeR+ "): " +balancE+ " Ft";}

    public void setAccountNumbeR(String accountNumbeR) {this.accountNumbeR = accountNumbeR;}
    public void setOwneR(String owneR) {this.owneR = owneR;}
    public void setBalancE(int balancE) {this.balancE = balancE;}

    public void deposit (int amount) {this.balancE=balancE+amount;}
    public void withdraw (int amount) {this.balancE=balancE-amount;}
}
