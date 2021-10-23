public class Driver {

    public static void main(String[] args){

SavingsAccount accountOne = new SavingsAccount();
SavingsAccount accountTwo = new SavingsAccount();
SavingsAccount accountThree = new SavingsAccount();

SavingsAccount.setAnnualInterestRate(20);

accountOne.setSavingsBalance(1000);
accountTwo.setSavingsBalance(2000);
accountThree.setSavingsBalance(3000);

SavingsAccount.modifyInterestRate(100);

System.out.println(SavingsAccount.getAnnualInterestRate() + " <-- This is the interest rate.");

System.out.println();

System.out.println(accountOne.getSavingsBalance() + " <-- This is your First Saving Account Balance");

System.out.println(accountTwo.getSavingsBalance() + " <-- This is your Second Saving Account Balance");

System.out.println(accountThree.getSavingsBalance() + " <-- This is your Third Saving Account Balance");

System.out.println();

accountOne.calculateMonthlyInterest();
accountTwo.calculateMonthlyInterest();
accountThree.calculateMonthlyInterest();

System.out.println();

System.out.println(accountOne.getSavingsBalance() + " <-- This is your " + accountOne.getAccountNumber() + " First Saving  Account Balance with the Monthly Interest rate.");
System.out.println(accountTwo.getSavingsBalance() + " <-- This is your " + accountTwo.getAccountNumber() + " First Saving  Account Balance with the Monthly Interest rate.");
System.out.println(accountThree.getSavingsBalance() + " <-- This is your " + accountThree.getAccountNumber() + " First Saving  Account Balance with the Monthly Interest rate.");
    }
}