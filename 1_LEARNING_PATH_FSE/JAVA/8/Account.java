public class Account {
    private int accountId;
    private String accountType;
    private int balance;
    public Account() {
        
    }
    public Account(int accountId, String accountType, int balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }
    public int getAccountId() {
        return this.accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    } 
    // getters abd setters for accountType
    public String getAccountType() {
        return this.accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    // getters and setters fro balance
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    // checking for the balance and deducting if possible
    public boolean withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        balance -= amount;
        System.out.println("Balance amount after withdraw: " + balance);
        return true;
    }
}
