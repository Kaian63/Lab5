import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(final double balance) {
        accountBalance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(final int number) {
        accountNumber = number;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(final String name) {
        ownerName = name;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
