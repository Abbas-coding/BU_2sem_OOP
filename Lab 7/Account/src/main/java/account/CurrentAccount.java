package account;

public class CurrentAccount extends Account{
    private String accountType;

    public CurrentAccount(int aNo, Member aOwner, String aBranch, double aBalance, String aType){
        super(aNo, aOwner, aBranch, aBalance);
        this.accountType = aType;
    }

    public String getAccountType() {
        return accountType;
    }
    public void displayInfo() {
        System.out.println("Account No: " + getAccountNo());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Owner Email: " + getOwnerEmail());
        System.out.println("Owner Contact: " + getOwnerContact());
        System.out.println("Account Branch: " + getAccountBranch());
        System.out.println("Account Balance: " + getAccountBalance());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("---------------------------");
    }
}
