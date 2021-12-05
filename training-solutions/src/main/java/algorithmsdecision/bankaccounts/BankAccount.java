package algorithmsdecision.bankaccounts;

public class BankAccount {

    private final String nameOfOwner;
    private final String accountNumber;
    private double balance;

    public BankAccount(String nameOfOwner, String accountNumber, double balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(int withdrawAmount) {
        return true;
    }


    public boolean deposit(int depositAmount) {
        balance += depositAmount;
        return true;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
