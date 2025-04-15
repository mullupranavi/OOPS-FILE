import java.util.ArrayList;
import java.util.List;
interface Account {
    void deposit(int amount);
    void withdraw(int amount);
    double calculateintrest();
    void balance();
}
class savingsaccount implements Account {
    public double balance;
    public double intrestrate;
    public savingsaccount(double balance, double intrestrate) {
        this.balance = balance;
        this.intrestrate = intrestrate;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount entered.");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -=amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public double calculateintrest() {
        return balance*(intrestrate/100);
    }
    public void balance() {
        System.out.println("Current balance: " + balance);
    }
    public double getintrestrate() {
        return intrestrate;
    }
}
class currentaccount implements Account {
    public double balance;
    public currentaccount(double balance) {
        this.balance = balance;
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount entered.");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -=amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public double calculateintrest() {
        return 0;
    }
    public void balance() {
        System.out.println("current balance: " + balance);
    }
}
class Bank {
    public List<Account> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void allaccounts() {
        for (Account account: accounts) {
            account.balance();
        }
    }
}
public class Accounttest {
    public static void main(String[] args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        Bank b = new Bank();
        Account sa = new savingsaccount(5000, 5); 
        Account ca = new currentaccount(2000);  
        b.addAccount(sa);
        b.addAccount(ca);
        sa.deposit(1000);
        sa.withdraw(200);
        ca.deposit(500);
        ca.withdraw(2500);  
        b.allaccounts();
    }
}

