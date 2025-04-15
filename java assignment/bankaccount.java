public class bankaccount {
    public int balance;
    public bankaccount(int balance) {
        this.balance = balance;
    }
    public int deposit(int amount) {
        balance = balance + amount;
        return balance;
    }
}
class savingsaccount extends bankaccount {
    public savingsaccount(int balance) {
        super(balance);
    }
    public void withdraw(int withdraw) {
        int fee = 100;
        int total = withdraw + fee;
        if (balance >= total) {
            balance = balance-total;
            System.out.println("Withdrawing the amount: " + total);
        } else {
            System.out.println("Enter valid amount.");
        }
    }
}
class checkingaccount extends bankaccount {
    checkingaccount(int balance) {
        super(balance);
    }
    public void withdraw(int withdraw) {
        int fee = 150;
        int total = withdraw + fee;
        if (balance >= total) {
            balance = balance-total;
            System.out.println("Withdrawing the amount: " + total);
        } else {
            System.out.println("Enter valid amount.");
        }
    }
}
