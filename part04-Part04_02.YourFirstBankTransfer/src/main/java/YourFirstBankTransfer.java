
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matt = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        
        
        matt.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        System.out.println(matt);
        System.out.println(myAccount);
  
    }
}
