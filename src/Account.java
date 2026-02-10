public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(); 
    }
    
    public void deposit(double depositAmount) {
        accountState.deposit(this, depositAmount);
    }
    
    public void withdraw(double withdrawAmount) {
        accountState.withdraw(this, withdrawAmount);
    }
    
    public void suspend() {
        accountState.suspend(this);
    }
    
    public void activate() {
        accountState.activate(this);
    }
    
    public void close() {
        accountState.close(this);
    }
    
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
    
    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public AccountState getAccountState() {
        return accountState;
    }
    
    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }
}