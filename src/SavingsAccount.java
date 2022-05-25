
//Rony Varghese
//   200455686

public class SavingsAccount extends Account {
    int noOfTransaction;
    double transactionFees;
    double interest;

    public SavingsAccount(double balance, Customer customer, double transactionfees, double interest) {
        super(balance, customer);
        this.setTransactionFees(transactionfees);
        this.setInterest(interest);
    }

    public double getTransactionFees() {
        return this.transactionFees;
    }

    public double getInterest() {
        return this.interest;
    }

    public int getNoOfTransaction() {
        return this.noOfTransaction;
    }

    public void setTransactionFees(double transactionfees) {
        this.transactionFees = transactionfees;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void withdraw(double withdraw) {
        ++this.noOfTransaction;
        if (withdraw > super.getBalance()) {
            throw new IllegalArgumentException("InSufficient Funds to withdraw");
        } else if (withdraw < 0.0D) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        } else {
            super.setBalance(super.getBalance() - withdraw);
            super.setBalance(super.getBalance() - this.transactionFees);
        }
    }

    public void deposit(double deposit) {
        ++this.noOfTransaction;
        if (deposit < 0.0D) {
            throw new IllegalArgumentException("Cannot deposit a negative number");
        } else {
            super.setBalance(super.getBalance() + deposit);
            super.setBalance(super.getBalance() + super.getBalance() * this.interest);
        }
    }

    public String toString() {
        return super.getCustomer() + "\nSAVINGS ACCOUNT\nNo Of Transactions  : " + this.getNoOfTransaction() + "\nTransaction Fees    : " + this.getTransactionFees() + "\nInterest Rate : " + this.getInterest() + "\nBalance         : " + super.getBalance();
    }
}
