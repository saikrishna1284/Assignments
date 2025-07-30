import java.util.Scanner;
public class AtmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm atm=new Atm(10000,120402);
        System.out.println("Enter Pin:");
        int enterpin=sc.nextInt();
        if(!atm.isValidate(enterpin)){
           System.out.println("Incorrect pin");
           return;
        }
        int choice;
        do{
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:System.out.println("Account Balance: "+atm.getbalance());
                        break;
                case 2:System.out.println("Enter the amount to be deposited:");
                       double depositedamount=sc.nextDouble();
                       atm.deposit(depositedamount);
                       break;
                case 3:System.out.println("Enter the amount to be withdraw:");
                       double withdrawamount=sc.nextDouble();
                       atm.withdraw(withdrawamount);
                       break;
                case 4:System.out.println("Thank you for using our ATM!");
                       break;
                default:System.out.println("Invalid choice. Try again.");
            }
        }while(choice!=4);


        
    }
    
}
