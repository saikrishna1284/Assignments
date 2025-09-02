public class Payment {
    protected double balance;
    public Payment(double balance){
        this.balance=balance;
    }

    
}
class UPi extends Payment{
    public UPi(double balance) {
        super(balance);
    }
   public void upiPayment(double amount){
    if(amount > 0 && amount <= balance){
        balance-=amount;
        System.out.println("Rs."+amount+"is debited from our account through upi");
    }else{
        System.out.println("Insufficient funds to make payment");
    }
   }
}
class Cash extends Payment{
    public Cash(double balance) {
        super(balance);
    }
   public void cashPayment(double amount){
    if(amount>0){
        System.out.println("Rs."+amount+"is payed through cash");
    }else{
        System.out.println("Insufficient funds to make payment");
    }
   }
}
class CreditCard extends Payment{
    public CreditCard(double balance) {
        super(balance);
    }
   public void creditCardPayment(double amount){
    if(amount > 0 && amount <= balance){
        balance-=amount;
        System.out.println("Rs."+amount+"is debited from our account through creditcard");
    }else{
        System.out.println("Insufficient funds to make payment");
    }
   }
}
class Main {
    public static void main(String[] args) {
        UPi upiPay = new UPi(1000);
        upiPay.upiPayment(300);   
        upiPay.upiPayment(800);  
        System.out.println("Remaining UPI Balance: Rs." + upiPay.balance);

        CreditCard ccPay = new CreditCard(2000);
        ccPay.creditCardPayment(500);
        ccPay.creditCardPayment(1700); 
        System.out.println("Remaining Credit Balance: Rs." + ccPay.balance);

        Cash cashPay = new Cash(0); 
        cashPay.cashPayment(200);
    }
}



