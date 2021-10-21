package statements;

public class Investment {

    private double cost  = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment (int funD, int interestRatE) {
        this.fund = funD;
        this.interestRate = interestRatE;
    }

    public int getFund() {return fund;}
    public double getYield(int days) {return (fund* (1+(interestRate/100.0)) *days / 365) -fund;}

    public double close (int days) {
        double balance = (getFund()+getYield(days)) * (1-cost/100);
        double payout = active ? balance : 0;
        active = false;
        return payout;
    }
}
