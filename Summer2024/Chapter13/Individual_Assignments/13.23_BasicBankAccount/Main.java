public class Main {
    
    public static BankAccount makeBankAccount(String accountHolderName, String accountNumber){
        BankAccount account = new BankAccount();
        account.accountHolderName = accountHolderName;
        account.accountNumber = accountNumber;
        account.accountBalance = 0.0;
        return account;
    }

    public static void displayInfo(BankAccount account){
        // Output
        String output = "Account Holder: %s\nAccount Number: %s\nAccount Balance: $%.2f";
        System.out.printf(output, account.accountHolderName, account.accountNumber, account.accountBalance);
    }
}
