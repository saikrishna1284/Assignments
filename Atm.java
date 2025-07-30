import java.util.Scanner.*;
public class Atm {
    private double balance;
    private int pin;
    public Atm(double intialBalance,int pin){
        this.balance=intialBalance;
        this.pin=pin;
    }
    public boolean isValidate(int pin){
        return this.pin==pin;
    }
    public void deposit(double amount){
       if(amount>0){
        balance+=amount;
        System.out.println(amount+" Sucesfully Deposited");
       }else{
        System.out.println("Invalid  Deposite amount ");
       }
    }
    public double getbalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println(amount + " withdrawn successfully.");
        }else{
            System.out.println("Insufficent Balance or Invalid Amount");
        }
    }
    
}
