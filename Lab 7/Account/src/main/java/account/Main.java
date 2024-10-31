package account;

public class Main {
    public static void main(String[] args) {

        // Create Member objects
        Member member1 = new Member("Alice Johnson", "alice@example.com", "1234567890");
        Member member2 = new Member("Bob Smith", "bob@example.com", "0987654321");
        Member member3 = new Member("Charlie Brown", "charlie@example.com", "1122334455");

        // Create CurrentAccount objects
        CurrentAccount currentAccount1 = new CurrentAccount(101, member1, "Main Branch", 1500.00, "Personal");
        CurrentAccount currentAccount2 = new CurrentAccount(102, member2, "Main Branch", 2000.00, "Business");

        // Create SavingAccount object
        SavingAccount savingAccount1 = new SavingAccount(201, member3, "Savings Branch", 3000.00, "Regular");

        // Display information
        System.out.println("Current Accounts:");
        currentAccount1.displayInfo();
        currentAccount2.displayInfo();

        System.out.println("Saving Account:");
        savingAccount1.displayInfo();

    }
}