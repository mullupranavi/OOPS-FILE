public class banktest {
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        bankaccount ba = new bankaccount(450000);
        savingsaccount sa = new savingsaccount(450000);
        checkingaccount ca = new checkingaccount(450000);
        System.out.println("depositing the amount: " + ba.deposit(3000));
        sa.withdraw(3000);
        ca.withdraw(3000);
    }
}
