public class Bankaccount{
 public int accountNumber;
 public string customername;
 public string branch;
 public int IFSCcode;
 public double balance;
}
 public Bankaccount(int account number, String customer name, String branch, int IFSC code, double balance){
 this.accountNumber = accountNumber;
 this.customername = customername;
 this.branch = branch;
 this.IFSCcode = IFSCcode;
 this.balance = balance;
  }
public void withdrawal(double amount){
 if(amount<=balance){
   balance-=amount;
   System.out.println("current balance:"+balance);
 }else{
      System.out.println("Invalid withdrawal amount");
      }
}
 public void deposit (double amount){
   balance+=amount;
   System.out.println("current balance:"+balance);
 }
 public static void main(String[]args){
    Bankaccount c1ba=new Bankaccount(24302,"Pranavi","Amaravati",744,20000);
    c1ba.withdrawal(1500);
    c1ba.deposit(3400);
 }
public static void main(String[]args){
    Bankaccount c2ba=new Bankaccount(24301,"Tanuja","Vizag",644,15000);
    c2ba.withdrawal(1000);
    c2ba.deposit(4000);
}