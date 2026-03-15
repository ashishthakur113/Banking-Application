public class BANK {

    private double balance;
    private double withDrawAmount;
    private double depositAmount;

    public BANK() {
        balance = 10000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithDrawAmount() {
        return withDrawAmount;
    }

    public void setWithDrawAmount(double withDrawAmount) {
        this.withDrawAmount = withDrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
