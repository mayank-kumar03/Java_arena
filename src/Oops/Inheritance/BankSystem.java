package Oops.Inheritance;
class Account{
    private int accno;
    private String name;
    private int amount;

    public Account(int accno, String name, int amount) {
        this.accno = accno;
        this.name = name;
        this.amount = amount;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
 class SavingsAccount extends  Account{

     private double interestRate;
   public SavingsAccount(int accno,String name,int amount,double interestRate){
       super(accno,name,amount);
       this.interestRate=interestRate;
   }

     public void deposit(int amt) {
         setAmount(getAmount() + amt);
         System.out.println("Deposited ₹" + amt + " successfully.");
     }

     public void withdraw(int amt) {
         if (amt > getAmount()) {
             System.out.println("Insufficient balance!");
         } else {
             setAmount(getAmount() - amt);
             System.out.println("Withdrawn ₹" + amt + " successfully.");
         }
     }

     public void calculateInterest() {
         double interest = getAmount() * (interestRate / 100);
         System.out.println("Interest earned: ₹" + interest);
         setAmount(getAmount() + (int) interest);
     }




 }
 class LoanAccount extends  Account{
     private double loanInterestRate;
     public LoanAccount(int accno, String name, int amount, double loanInterestRate) {
         super(accno, name, amount);
         this.loanInterestRate = loanInterestRate;
     }
     public void payEMI(int amt) {
         setAmount(getAmount() - amt);
         System.out.println("EMI payment of ₹" + amt + " done successfully.");
     }

     public void applyInterest() {
         double interest = getAmount() * (loanInterestRate / 100);
         System.out.println("Loan interest added: ₹" + interest);
         setAmount(getAmount() + (int) interest);
     }

 }

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Mayank", 10000, 5);
        System.out.println(sa);
        sa.deposit(2000);
        sa.calculateInterest();
        sa.withdraw(3000);
        System.out.println(sa);

        System.out.println("-----------------------");

        LoanAccount la = new LoanAccount(202, "Mayank", 50000, 10);
        System.out.println(la);
        la.applyInterest();
        la.payEMI(5000);
        System.out.println(la);
    }
}
