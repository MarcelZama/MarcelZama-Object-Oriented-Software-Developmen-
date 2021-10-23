public class SavingsAccount {

    private int accountNumber;
    private static float annualInterestRate;
    private float savingsBalance;

    private float monthlyInterest = 0;

    private static int nextFreeAccountNumber = 1;

    public SavingsAccount(){
        accountNumber = nextFreeAccountNumber;
        nextFreeAccountNumber++;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public static void setAnnualInterestRate(float annualInterestRate){
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
    public static float getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setSavingsBalance(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public float getSavingsBalance(){
        return this.savingsBalance;
    }

    public float calculateMonthlyInterest() {
        monthlyInterest = (this.savingsBalance * annualInterestRate)/12;
        this.savingsBalance = this.savingsBalance + monthlyInterest;
        return savingsBalance;
    }

    public static float modifyInterestRate(float newInterestRate) {
        annualInterestRate = newInterestRate;
        return annualInterestRate;
    }



}