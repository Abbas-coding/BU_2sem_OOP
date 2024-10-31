package account;

public class Account {
    private int accountNo;
    private Member accountOwner;
    private String accountBranch;
    private double accountBalance;

    public Account(int aNo, Member aOwner, String aBranch, double aBalance){
        this.accountNo = aNo;
        this.accountOwner = aOwner;
        this.accountBranch = aBranch;
        this.accountBalance = aBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return accountOwner.getMemberName();
    }
    public String getAccountBranch(){
        return accountBranch;
    }
    public String getOwnerEmail(){
        return accountOwner.getMemberEmail();
    }
    public String getOwnerContact(){
        return accountOwner.getMemberContact();
    }
}
