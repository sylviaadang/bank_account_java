public class BankAccount {
    // MEMBER VARIABLES
    private long accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        Double checkingBalance = 0.0;
        Double savingsBalance = 0.0;
        accounts += 1;
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public void setCheckingBalance(Double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public Double getCheckingBalance() {
        return checkingBalance;
    }

    public void setSavingsBalance(Double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public Double getSavingsBalance() {
        return savingsBalance;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    public void deposit(String type, Double amount) {
        if (type == "checking" || type == "Checking"){
            setCheckingBalance(getCheckingBalance() + amount);
        }

        if (type == "savings" || type == "Savings") {
            setSavingsBalance(getSavingsBalance() + amount);
        } else {
            System.out.println("Please choose appropriate acount type.");
        }
    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public void withdraw(String type, Double amount) {
        if (type == "checking" || type == "Checking"){
            if (getCheckingBalance() < amount) {
                System.out.println("Insufficient Funds!");
            } else {
                setCheckingBalance(getCheckingBalance() - amount);
                totalMoney -= amount;
            }
        }


        if (type == "savings" || type == "Savings") {
            if (getSavingsBalance() < amount) {
                System.out.println("Insufficient Funds!");
            } else {
                setSavingsBalance(getSavingsBalance() - amount);
                totalMoney -= amount;
                }
            }
        }

    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public Double getBalance() {
        Double totalBalance = checkingBalance + savingsBalance;
        System.out.println(totalBalance);
        return totalBalance;
    }
}
