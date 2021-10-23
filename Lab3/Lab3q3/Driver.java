public class Driver {

    public static void main(String[] args){

        BankCustomer accountOne = new BankCustomer("Joe Krick","13 Abbey avenue,wicklow,Co.Wicklow");
        BankCustomer accountTwo = new BankCustomer("Mark McGregor","178 Main road,Carlow,Co.Carlow");

        accountOne.addAccount(1000);
        accountOne.addAccount(4000);
        accountOne.addAccount(8000);
        accountOne.addAccount(1000000000);

        accountTwo.addAccount(9000);
        accountTwo.addAccount(3000);
        accountTwo.addAccount(6000);

        System.out.println();
        System.out.println();

        accountOne.balance();
        accountTwo.balance();

        System.out.println(accountOne.ToString());
        System.out.println("\n The Total Amount on all your account is --> " +  accountOne.balance() );
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println(accountTwo.ToString());
        System.out.println("\n The Total Amount on all your account is --> " +  accountTwo.balance() );

    }
}