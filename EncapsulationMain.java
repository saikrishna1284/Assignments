public class EncapsulationMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountHolder("Sai Krishna");
        account.setBalance(5000);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(20000);
        account.withdraw(1500);
        account.withdraw(17000); 

    
        System.out.println("Final Balance: " + account.getBalance());
    }
}
