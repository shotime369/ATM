public class Bank {

    private static int balance = 250;

    public static boolean verify(String cardNumber, String pin) {
        //simulate pulling from the banks database of customers
        String validCardNumber = "123456789";
        String validPin = "1234";
        return cardNumber.equals(validCardNumber) && pin.equals(validPin);
    }

    public static int checkBalance(){
        return balance;
    }

    public static void deposit(int amount){
        balance += amount;
        System.out.println("Your new balance is:"+ Bank.checkBalance());
    }
    public static void withdraw(int amount){
        balance -= amount;
    }

    public static void deposit(){
        System.out.println("you have not deposited any notes\n your balance is:" + checkBalance());
    }

    public static void verifyBalance(int amount){
       int balance=checkBalance();
       if (balance<(amount)){
           System.out.println("Not enough balance");
       }
       else {
           withdraw(amount);
           System.out.println("Withdraw successful");
       }
    }


}
