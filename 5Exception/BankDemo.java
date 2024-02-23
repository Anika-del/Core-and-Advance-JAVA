import java.io.*;

import javax.management.InstanceNotFoundException;
import javax.naming.InsufficientResourcesException;

public class BankDemo {

    public static void main(String[] args) {
        
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Deposit $500 ... ");
        c.deposit(500.00);
        try{
            System.out.println("\n Widthdrawing $100 ... ");
            c.withdraw(100.00);
            System.out.println("\n Withdraw $600");
            c.withdraw(600.00);
        }
        catch(InsufficientFundsException e){
            System.out.println(" Sory but you are sort $ " + e.getAmount());
            e.printStackTrace();
        }
    } 
}
class InsufficientFundsException extends Exception{
    private Double amount;
    public InsufficientFundsException(double amount ){
        this.amount = amount ;
    }
    public double getAmount(){
        return amount;
    }
}
class CheckingAccount{
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number = number;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount)throws InsufficientFundsException{

        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}
/* 
Deposit $500 ... 

 Widthdrawing $100 ...        

 Withdraw $600
 Sory but you are sort $ 200.0
InsufficientFundsException
        at CheckingAccount.withdraw(BankDemo.java:49)
        at BankDemo.main(BankDemo.java:17)
PS D:\1CoreJava\5Exception> 
*/