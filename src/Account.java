
//Rony Varghese
//   200455686


public class Account {
    private double balance;
    public Customer customer;

    public Account(double balance, Customer customer) {
        this.balance = balance;
        this.customer = customer;
    }

    public Account(Customer customer) {
        this.customer = customer;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    //if the withdrawn amount is less than balance Insufficient funds to withdraw will be shown
    //and if the withdrawn amount is less than 0 cannot withdraw a negative amount will be shown.
    public void withdraw(double withdraw) {
        if (withdraw > this.balance) {
            throw new IllegalArgumentException("InSufficient Funds to withdraw");
        } else if (withdraw < 0.0D) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        } else {
            this.balance -= withdraw;
        }
    }
    // If the amount deposited is less than 0 cannot deposit a negative number will be displayed.

    public void deposit(double deposit) {
        if (deposit < 0.0D) {
            throw new IllegalArgumentException("Cannot deposit a negative number");
        } else {
            this.balance += deposit;
        }
    }

    public String toString() {
        return this.getCustomer() + "\nBalance        : " + this.getBalance();
    }
}
