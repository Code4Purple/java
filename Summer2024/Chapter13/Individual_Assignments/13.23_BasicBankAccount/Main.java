public class Main {
    
    public static BankAccount makeBankAccount(String accountHolderName, String accountNumber){
        BankAccount account = new BankAccount();
        account.accountHolderName = accountHolderName;
        account.accountNumber = accountNumber;
        account.accountBalance = 0.0;
        return account;
    }

    public static void displayAccountInfo(BankAccount account){
        // Output
        String number = "Account number      : %s\n";
        String name = "Account holder name : %s\n";
        String balance = "Account Balance     : $%.2f\n";
        String output = number + name + balance;

        System.out.printf(output, account.accountNumber, account.accountHolderName, account.accountBalance);

    }
}
