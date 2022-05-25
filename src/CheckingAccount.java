
//Rony Varghese
//   200455686

public class CheckingAccount extends Account {
    private double monthlyfees;
    private double overdraftfees;
    private double overdraftlimit;
    private boolean overdraftactive;

    public CheckingAccount(double balance, Customer customer, double monthlyfees, double overdraftfees, double overdraftlimit) {
        super(balance, customer);
        this.setOverDraftActive(true);
        this.setOverDraftLimit(overdraftlimit);
        this.setOverDraftFees(overdraftfees);
        this.setMonthlyFees(monthlyfees);
    }

    public double getMonthlyFees() {
        return this.monthlyfees;
    }

    public double getOverDraftLimit() {
        return this.overdraftlimit;
    }

    public double getOverDraftFees() {
        return this.overdraftfees;
    }

    public Boolean getOverDraftActive() {
        return this.overdraftactive;
    }

    public void setOverDraftActive(boolean overdraftactive) {
        this.overdraftactive = overdraftactive;
    }

    public void setOverDraftLimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

    public void setOverDraftFees(double overdraftfees) {
        this.overdraftfees = overdraftfees;
    }

    public void setMonthlyFees(double monthlyfees) {
        this.monthlyfees = monthlyfees;
    }

    //If the withdrawn amount is less than 0 cannot withdraw a negative amount will be shown.
    //if the withdrawn amount is less than balance plus your account has insufficient balance will be shown.

    public void withdraw(double withdraw) {
        if (withdraw < 0.0D) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        } else {
            if (withdraw > super.getBalance()) {
                if (!this.overdraftactive) {
                    throw new IllegalArgumentException("Cannot withdraw beyond the limit");
                }

                if (withdraw > super.getBalance() + this.overdraftlimit) {
                    throw new IllegalArgumentException("Your Accout has insufficient balance");
                }

                super.setBalance(super.getBalance() - withdraw);
                super.setBalance(super.getBalance() - this.overdraftfees);
            } else {
                super.setBalance(super.getBalance() - withdraw);
            }

        }
    }

    // If the amount deposited is less than 0 cannot deposit a negative number will be displayed.


    public void deposit(double deposit) {
        if (deposit < 0.0D) {
            throw new IllegalArgumentException("Cannot deposit a negative number");
        } else {
            super.setBalance(super.getBalance() + deposit);
        }
    }

    public String toString() {
        return super.getCustomer() + "\nCHECKING ACCOUNT\nMonthly Fees    : " + this.getMonthlyFees() + "\nOverDraft Limit : " + this.getOverDraftLimit() + "\nOverDraft Fees  : " + this.getOverDraftFees() + "\nBalance         : " + super.getBalance();
    }
}
