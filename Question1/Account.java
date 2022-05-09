package Question1;



public class Account {
    private String accountNumber;
    private double balance;

   public Account(){

   }
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



    public void deposit(int amount){
        balance = balance+amount;
        setBalance(balance);
    }


    public void withdraw(int amount) throws InsufficientFundsException{

        if(amount>balance){
            InsufficientFundsException s = new InsufficientFundsException("enter amount less than");
            throw s;
        }
        else{
            balance = balance-amount;
            setBalance(balance);
        }
    }
}
