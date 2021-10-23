public class BankCustomer {

    private String customerName;
    private String customerAddress;
    private float  bankaccountone;
    private float  bankaccounttwo;
    private float  bankaccountthree;
    private int bankaccountnr = 0;
    private float totalbalance;

    public BankCustomer(String NewCustomerName,String NewCustomerAddress){
        customerName = NewCustomerName;
        customerAddress = NewCustomerAddress;
    }

    public float addAccount(float newsavingBalance){
        bankaccountnr++;
        switch(bankaccountnr)
        {
            case 1:
            bankaccountone = newsavingBalance;
            return  bankaccountone;

            case 2:
            bankaccounttwo = newsavingBalance;
            return  bankaccounttwo;

            case 3:
            bankaccountthree = newsavingBalance;
            return bankaccountthree;
            
            default:
                return 0;

        }
    }
    public float balance(){
        totalbalance = bankaccountone + bankaccounttwo + bankaccountthree;
        return totalbalance;
    }

    public String ToString(){
        String string="";
        string+=customerName;
        string+="\n";
        string+=customerAddress;
        string+="\n";
        string+="\n";
        string+=" Your Bank Accounts Details:";
        string+="\n Your First Account " +  bankaccountone;
        string+="\n Your Second Account " +  bankaccounttwo ;
        string+="\n Your Third Account " +  bankaccountthree ;
        return string;
    }

}