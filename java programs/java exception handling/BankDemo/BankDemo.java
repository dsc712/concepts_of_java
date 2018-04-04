import java.io.* ;

class InsufficientFundException extends Exception
{
 private double amount ;

 InsufficientFundException(double amount)
  {
    this.amount = amount ;
  }
 double getAmount()
 {
   return amount ;
  }

}


class CheckingAccount{

 private double balance ;
 private int number ;
 
 public CheckingAccount(int number)
 {
   this.number = number ;
 } 
 public void deposit(double amount)
 {
   balance += amount ;
 }
 public void withdraw(double amount) throws InsufficientFundException
 {
   if(amount <= balance)
    {
       balance -= amount ;
     }
    else
    {
      double needs = amount - balance ;
      throw new InsufficientFundException(needs) ;
     }
 }

 public double getBalance()
 {
   return balance ;
 }
 public int getNumber()
 {
  return number ;
 }
}

public class BankDemo
{
 public static void main(String... args)
 {
   CheckingAccount c = new CheckingAccount(101) ;
   System.out.println("depositing $500... ") ;
   c.deposit(500.00) ;
  
   try{
     System.out.println("\n withdrawing $100 ...") ;
     c.withdraw(100.00) ;
     System.out.println("\n withdrawing $600 ...") ;
     c.withdraw(600.00) ;
   }
   catch(InsufficientFundException e){
     System.out.println("sorry you are short of $" + e.getAmount() ) ;
     e.printStackTrace() ;
    }
  }
}

 